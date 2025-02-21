public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        // 1
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result = result ^ num; // XOR operator - if same number  then it return 0.
            // 0 ^ 2 = 2
            // 2 ^ 2 = 0
        }
        return result;
    }
}
