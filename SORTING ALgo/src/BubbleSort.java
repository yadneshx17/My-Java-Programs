import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        // int[] arr = {3, 1, 5, 4, 2};
        int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {-1, -32, 7, 0, 76};
        bubble(arr);
            System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){  
        // boolean swapped;
        // run the steps n-1 times.
        for (int i = 0; i < arr.length; i++) {
            // swapped = false;
            // for each step, max item will come at the last respective index.
            for (int j = 1; j < arr.length - i; j++) { // or <= arr.length - i - 1.
                // swap if the item is smaller than than the previous item.
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    // swapped = true;
                }
            }     
            // if(!swapped) { // !false = true;
            //     break;
            // }
        }
        
    }

}  