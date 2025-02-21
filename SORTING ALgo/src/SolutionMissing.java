// import java.util.Arrays;

// Q 268 : https://leetcode.com/problems/missing-number/
// Asked in Amazon

public class SolutionMissing {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
        // System.out.println(Arrays.toString(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i]; // Correct index will be the element itself coz starting from 0 to N.
            if(arr[i] < arr.length && arr[i] != arr[correct]){ // if element is not on its correct position swap else increment i.
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        
        // search for the missing number.
        for (int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }

        // case 2
        return arr.length;

    }

    // swap function.
    static void swap(int[] arr, int first, int second){ 
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}