package RecursionLevel1Que;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(30210004));
    }

    
    static int count(int n) {
        // needed an extra variable for taking counting so added/passed it in argument.
        return helper(n, 0);  
    }

    // special pattern, how to pass a value to above calls
    // variable in argument "c" will be return from base condition.
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}