public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int index = start; index <= end; index++){
            // check for element at every index if it is equal to target number.
            int element = arr[index]; // ex. index: 0 , element = 23.
            if (element == target){ // ex. target: 19, elemenet: 23
                return index;
            }

        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
