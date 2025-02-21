public class OrderAgnosticBS {
    public static void main(String[] args) {
        // Ascending - Increasing.
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};

        // Decending - Decreasing.
        // int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        
        int target = 22;
        
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is [ Ascending ] or [ Descending ].

        // Asc Condition.
        boolean isAsc = arr[start] < arr[end];

        while ( start <= end) {
            // find the middle element.
            // int mid = (start + end) / 2; // // might be possible that (start + end) exceeds the range of int in java.
            int mid = start + (end - start) / 2;
            
            // Middle Element is Ans.
            if (arr[mid] == target) {
                return mid;
            }
            
            if (isAsc) { // agar ascending hua toh ye nhi toh else wala.
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                // Descending
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }        
            }            
        }
        return -1;

    }
}