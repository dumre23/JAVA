public class ReverseArray {

    public static void reverse(int [] arr){
        int st= 0;
        int end = arr.length-1;
        while(st < end){
            //swap elmt of those index
            int temp = arr[st];
            arr[st]= arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void main(String args[]){
        int [] arr = {7,5,2,9,6,1};
        reverse(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    
}
