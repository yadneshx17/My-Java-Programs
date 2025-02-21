package RecursionLevel1Que;
public class Nto1 {
    public static void main(String[] args) {
        // fun(5);
        funRev(5);
        // funBoth(5);
    } // call will get out from here.

    static void fun(int n) { 
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    } // from where will the function will get\ out from where it was being called.
    
    static void funRev(int n) { 
        if (n == 0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

    static void funBoth(int n) { 
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
