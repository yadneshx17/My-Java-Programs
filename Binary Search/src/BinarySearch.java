public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

        // System.out.println(arr.length); // output : 13
    }
    // return the index.
    // return "-1" if it does not exist.
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // finding the middle Element.class

            // WE CAN'T USE THIS FORMULA, cause int have fix value, like it can contain values to some extent only so if the addition of "start + end" became big so it can give's error.
            // int mid = (start + end) / 2;

            // BEST FORMULA.
            int mid = start + (end - start) / 2;
            
            // Middle Element is Ans.
            if (arr[mid] == target) {
                return mid;
            }

            // Checking the conditions of target if it is [ less than ] or [ More than ] or [ Equal ] to MIDDLE ELEMENT.
            if (target < arr[mid]){ // Mid ka index jayega arr mein.
                end = mid - 1; // left side. start same end mid - 1 ayega.

            } else if (target > arr[mid]){ 
                start = mid + 1;

            } else {
                // ans found
                return mid;
            }
        }    
        return -1;  
    }
}