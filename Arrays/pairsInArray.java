public class pairsInArray {
 //   Time Complexity : O(n^2)

    public static void printPairs(int[] arr){
        int totalPairs= 0;
        for(int i = 0; i<arr.length; i++) {
            for(int  j = i+1; j<arr.length; j++) {
                System.out.print("("+arr[i]+" , "+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total no of pairs formed: "+totalPairs);

        //Total no of pairs in an array : n(n-1)/2

    }
    public static void main(String args[]) {
        int arr[] = {7,5,9,2,6,1};
        printPairs(arr);
    }
    
}
