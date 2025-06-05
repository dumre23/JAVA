public class BinarySearch { //Time Complexity : O(logn)
    //Spaace Complexity : O(1), no extra memory space used 
    
    public static void binSearch(int [] arr, int key){
        int start = 0; 
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                System.out.println(key+" found");
                return;
            }else if(arr[mid] < key){   //Search on Right
                start = mid + 1;
            }else{                      //Search on Left
                end = mid - 1;
            }
        }System.out.println(key+" Not found");
    }
    public static void main(String args[]){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int key = 6;
        binSearch(arr, key);
    }
}
