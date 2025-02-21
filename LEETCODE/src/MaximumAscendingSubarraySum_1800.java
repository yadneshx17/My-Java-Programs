public class MaximumAscendingSubarraySum_1800 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,5,10,50};
        // 65
        System.out.println(maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
        int curr = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {

            curr = nums[i] > nums[i - 1] ? curr + nums[i] : nums[i];
            /*
            if (nums[i] > nums[i - 1]) {
                curr = curr + nums[i];
            } else {
                curr = nums[i];  // resets.
            }
            */

            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
