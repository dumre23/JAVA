public class linearSearch {

    public static int linearSrch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String args[]) {
        int [] arr = {7,5,2,8,0,1,3,4,6,9};
        int key = 3;
        int result = linearSrch(arr, key);
        if (result != -1){
            System.out.println("Found at index: "+ result);
        }else{
            System.out.println("Not found");
        }
    }

}
