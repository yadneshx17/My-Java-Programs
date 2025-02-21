// Q 1095 - https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchInMountain {
    public static void main(String[] args){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak); // first asc-part(peak) tak dekhega.

        if(firstTry != -1) {
            return firstTry; 
        }
        // try to search in second half 
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }
                 
    // returns index of peak value.
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // Dec part of array
                // this [mid] maybe the answer but check left.
                end = mid; 
            } else {
                // you are in Asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        return start; // or return end as both are =.
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

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