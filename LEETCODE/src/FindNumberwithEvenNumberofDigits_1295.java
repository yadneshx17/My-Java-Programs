public class FindNumberwithEvenNumberofDigits_1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int n){
        int numberOfDigits = digits(n);
        if(numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }
    // static int digits(int num) {
    //     if(num<0) {
    //         num = num * -1;
    //     }
    //     if(num == 0) {
    //         return 1;
    //     }
    //     int count = 0;
    //     while(num>0) {
    //         count++;
    //         num = num/10;
    //     }
    //     return count;
    // }

    static int digits(int num) {
        if(num<0) {
            num = num * -1; // -22 * -1 = 22 // Gives Positive.
        }
        if(num == 0) {
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
