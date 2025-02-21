public class EvenDigits {
    public static void main(String[] args){
        int[] nums = {12, 345, 2, 6, 7896};
        // System.out.println(findNumbers(nums));

        // Digits function.
        // System.out.println(digits(4545));
        System.out.println(digits(-44));
        System.out.println(digits2(-44));

    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    
    // Function to check whether a number contains even digit or not.
    static boolean even(int num){
        int numberofDigits = digits(num); // Number counts count digits mein ayega.
        
        /* 
        if (numberofDigits % 2 == 0){// if the number of digits(counts) is divisible by 2 i.e, it is a even number.
            return true; 
        }
        return false;
        */

        // Shortcut for if statement.
        return numberofDigits % 2 == 0; // returns true or false.
        // if reminder gives 0 returns true other wise false. 
        
    }

    // count number of digits in a number
    static int digits(int num){
        int count = 0;
        // making negative to posi then counting.
        if (num < 0){
            num = num * -1;
        }

        while (num > 0) {
            count++;
            num = num / 10; // num /= 10     
        }
        return count;
    }

    // Optimised way to count digits.
    static int digits2(int num){
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

}
