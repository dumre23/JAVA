
public class maxSubArrSum {

    public static void main(String args[]) {
        int[] arr = {1, -2, -1, 6, -3};
        System.out.println("Max SUb Array Sum: " + maxSubArraySum(arr));
        System.out.println("Max SUb Array Sum by prefixSum: " + prefixSum(arr));
        System.out.println("Max SUb Array Sum by Kadane's Algm: " + Kadane(arr));
    }

    public static int maxSubArraySum(int[] arr) {    //Time_Complexity : O(n^3)

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {  //starting index

            for (int j = i; j < arr.length; j++) {   //end index 
                int curr_sum = 0;
                for (int k = i; k <= j; k++) {   //sub-arr in between the index's
                    curr_sum += arr[k];
                }
                max = Math.max(max, curr_sum);
            }

        }

        return max;

    }

    //Using Prefix-Array : Optimized T.C : [O(n^2)] ,but SC=[O(n) 
    public static int prefixSum(int[] arr) {

        int curr_sum = 0;
        int max = Integer.MIN_VALUE;

        int[] prefixArr = new int[arr.length];

        //PrefixArr values(SUM) updation
        prefixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                curr_sum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];
                max = Math.max(max, curr_sum);
            }

        }
        return max;
    }

    //Most-Optimzed: Kadane's Algm; T.C : O(n)
    public static int Kadane(int[] arr) {
        //if sum < 0 , encountered make it 0 and ignore sub-arr till there, if Max SubArr is not found.

        int curr_sum = 0;
        int Max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];

            if (curr_sum < 0) {
                curr_sum = 0;
            }
            Max_sum = Math.max(Max_sum, curr_sum);
        }

        return Max_sum;

    }
}
