package com.hawk;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your first number: ");
        int a = in.nextInt();
        System.out.print("Enter Your second number: ");
        int b = in.nextInt();
        System.out.print("Enter Your third number: ");
        int c = in.nextInt();

        // Q: Find largest of the 3 numbers
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        else if (c > max) {
//            max = c;
//        }

//        int max;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

//        System.out.println("Largest number between all three number is> " + max);

        // --------------------------------------------------------------------------
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

    }
}