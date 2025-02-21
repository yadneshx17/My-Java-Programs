public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertion(arr);
    }
    
    static void insertion(int[] arr){
        for(int i =0; i < arr.length - 1; i++){ // [< arr.length - 1] is same as [<= arr.length - 2]
            for(int j = i+1; i > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap (arr, j, j-1);
                } else {
                    break;
                }
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