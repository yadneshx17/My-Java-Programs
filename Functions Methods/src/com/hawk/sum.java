package com.hawk;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
    //    int ans = sum2();
    //    System.out.println(ans);
        int ans = sum3(20, 30);
        System.out.println(ans);
}
      
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }


    // https://chatgpt.com/share/dc4b3391-15eb-4679-962f-60b79093bbfa
    // the return type of a method, specifies the type of value that the method will return to the caller when it finishes executing. 
    // return the value

    /* 
    static int sum2(){ // return type : int 
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter Number 1: ");
            int num1 = in.nextInt();
            System.out.print("Enter Number 2: ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            return sum;    // The return statement is used to exit a function and send a value back to the caller(sum2 here).   
        }
    }
    */



    // static void sum () {  // returning nothing so Void.
    //     Scanner in = new Scanner(System.in);
    //     System.out.print("Enter Number 1: ");
    //     int num1 = in.nextInt();
    //     System.out.print("Enter Number 2: ");
    //     int num2 = in.nextInt();
    //     int sum = num1 + num2;
    //     System.out.println("The sum: " + sum); // outputing value.
    // }

    /*
        // return type in Java specifies what type of value a method will return, if any.
        return_type name (){
            // body
            return statement;
        }
    */
}