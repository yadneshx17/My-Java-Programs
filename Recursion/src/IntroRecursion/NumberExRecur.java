package IntroRecursion;
public class NumberExRecur {
    public static void main(String[] args) {
        // if we wanna print 1 lac numbers we can't make that much functions.
        // And the function have body and etc stuff so making a general function.
        print(1);
    }

    // Generalised way.
    static void print(int n) {
        // Base condition.  
        if(n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // Recursive Call.

        // this is called Tail Recursion.
        // this is the last function call.
        print(n + 1); 
    }
}