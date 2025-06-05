public class largestInArray {

    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int num :  arr) {
            if(num > largest) {
                largest = num;
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int [] arr= {7,5,2,8,9,1,0,-5,3};
        int largest = findLargest(arr);
        System.out.println("Largest element in the array is: " + largest);
    }

    
}
