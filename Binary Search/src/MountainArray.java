// Q 852 -     // https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Q 162- https://leetcode.com/problems/find-peak-element//

public class MountainArray {
    public static void main(String[] args){


    }
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
         // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =.
    }
}