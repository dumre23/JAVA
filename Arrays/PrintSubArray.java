
public class PrintSubArray {
    //Time Complexity : O(n^3)
    //Space Complexity : O(1), no extra space used

    public static void printSubArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {  //starting index of subarray
            // for each starting index, we will find all the ending index
            for (int j = i; j < n; j++) {  //ending index of subarray
                System.out.print("[ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    if (k < j) {
                        System.out.print(",");
                    }
                }
                System.out.print("]");
                System.out.println();
            }
        }

        // Total no of subarrays in an array of size n : n(n+1)/2
    }

    public static void main(String args[]) {

        int[] arr = {7, 5, 2, 3, 9};
        printSubArray(arr);
    }

}
