//  Q. 34 https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstandLastPosition {
    public static void main(String[] args) {
        

    }
   
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // checks for the start and end.
        ans[0] = search(nums, target, true);
        if (ans[0] != -1){
            ans[1] = search(nums, target, false); // false karne pe right pe search( last occurrence ) keliye chalega.
        }

        return ans;
    }


    // This function just returns the index value of target.
    int search(int[] nums, int target, boolean finStartIndex) {
        int ans = -1;   
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            
            // BEST FORMULA.
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){ // Mid ka index jayega arr mein.
                end = mid - 1; // left side. start same end mid - 1 ayega.

            } else if (target > nums[mid]){ 
                start = mid + 1;

            } else {
                // potential(middle) is ans found
                ans = mid;

                // there might be another ans lying on the left side (first occurrence).
                if(finStartIndex){ // if finding start index
                    end = mid - 1;
                } else { // otherwise right hand side last index of the target.
                    start = mid + 1; 
                }
            }
        }    
        return ans;  
    }
}