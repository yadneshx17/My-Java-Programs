package RecursionLevel1Que;
public class Reverse {
    public static void main(String[] args) {
        // 1st.
        // rev1(1234);
        // System.out.print(sum);
        
        // 2nd.
        // System.out.println(rev2(1234));

        // Working of that formula outputs : no of digits.
        // https://chatgpt.com/share/fc5c1e9f-5426-4b4f-a459-81a024ad33f8
        int n = 1234;
        System.out.println((int)(Math.log10(n)) + 1); // 3 + 1 
    }
    
    // 1- Way.
    static int sum = 0;
    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    // 2nd Way.
    static int rev2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;  // 3 + 1
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}