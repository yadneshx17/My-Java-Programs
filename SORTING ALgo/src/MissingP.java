public class MissingP {
    public static int FirstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){ 
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        
        // search for the missing number.
        for (int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                return index + 1;
            }
        }
        // case 2
        return arr.length + 1;
    }

    // swap function.
    static void swap(int[] arr, int first, int second){ 
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}