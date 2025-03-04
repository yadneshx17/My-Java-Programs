import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        
        // swap(arr, 1, 3);

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
 
    static void reverse(int[] arr){
        int start = 0; // index values.
        int end = arr.length-1;  // index values.

        while( start < end){
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1]; // 1
        arr[index1] = arr[index2]; // 3
        arr[index2] = temp;
    }
}