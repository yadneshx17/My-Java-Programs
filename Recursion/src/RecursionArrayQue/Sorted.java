package RecursionArrayQue;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 16, 8};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int index) {
        // Base condition
        if (index == arr.length - 1){
            return true; // if index goes til last index coz it does not violated any condition so array is sorted.
        }
        
        return arr[index] < arr[index + 1] && sorted(arr, index + 1); 
    }
}
