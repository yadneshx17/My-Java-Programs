import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        isArmstrong(n);
        System.out.println(isPrime(n));
    }

    // 153 - 1*1*1 + 5*5*5 + 3*3*3 = 153
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while(n>0) {
            int rem = n % 10;
            n = n/ 10;
            sum = sum + rem*rem*rem;
        }
        return  sum == original;
    }

    static boolean isPrime(int n) {
        if (n <= 1 ) {
            return false;
        }
        int c = 2;
        while(c * c <= n) {
            if (n%c==0) {
                return false;
            }
        }
        return true;
    }

}
