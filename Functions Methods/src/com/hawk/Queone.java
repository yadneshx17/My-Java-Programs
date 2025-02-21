import java.util.Scanner;

public class Queone{
    public static void main(String[] args){
        // prime-numbers - numbers which are divisible by one and the no itself. ex, 7.
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            boolean ans = isPrime(n);
            System.out.println(ans);
        }
    }

    static boolean  isPrime(int n){
        if (n <= 1){  // numbers less than or equal to 1 are not prime.
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){ // if n is divisible by c. If so, it returns false because n is not prime.
                return false;
            }
            c++;
        }
        return true;  //  if the loop completes without finding any factors, it means n is prime, so the method returns true.
    }
}