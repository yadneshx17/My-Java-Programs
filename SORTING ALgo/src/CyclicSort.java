import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1; // gives correct position index of element.
            if(arr[i] != arr[correct]){ // if element is not on its correct position swap else increment i.
                swap(arr, i, correct);
            } else {
                i++;
            }

        }
    }
    // swap function.
    static void swap(int[] arr, int first, int second){ 
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}