package IntroRecursion;

public class NumberExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it.
        // print first 5 numbers: 1 2 3 4 5
        // call it Once.
        print1(1);
    }

    // 1> Function calling Another Function.
    // 2> All these functions have same body and defination. just name of fn is diff.
    // Taking a No; printing a Number; Calling another Fn 
    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    // func body here changes >>> Taking a Number; printing a number, here it is not calling anything.
    static void print5(int n) {
        System.out.println(n);
    }
}