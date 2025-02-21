package com.hawk;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
            Syntax of FOR LOOPS:

                for(initialisation; condition; increment/decrement;){
                    // body
                }
        */

        // Q: Print number from 1 to 5
//        for (int num=1; num <= 5; num += 1){
//            System.out.println(num);
//        }


        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number till you have to count: ");
        int n  = in.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.println(num + "");
//            System.out.println(num + ") " + "Hello World!!!");
        }

        /*
            WHILE LOOP

            Syntax :
            while (condition){
                // body
            }



          int num = 1;
          while(num <= 5){
            System.out.println(num);
            num += 1;
          }

        */


        /*
        Synatx: do while

            do {
                   // Do Something.
            } while (conition);

         */

        // Gonna Execute at least once.
//
//        int n = 1;
//        do {
//            System.out.println("Hello world"); // aik bar execute hoga then condition is checked.
//        } while (n != 1);
    }
}
