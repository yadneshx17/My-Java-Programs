package com.hawk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter fruit name: Mango, Apple, Orange, Grapes>>> ");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // 1st
        // ENHANCED SYNTAX
//        switch (fruit) {
//            case "Mango" -> System.out.println("That is King of fruits");
//            case "Apple" -> System.out.println("Red sweet fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small round fruit");
//            default -> System.out.println("This is fruit");
//        }

        // 2nd
        // Normal syntax
                switch ( fruit ){
            case "Mango":
                System.out.println("That is King of fruits");
                break;
            case "Apple":
                System.out.println("Red sweet fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small round fruit");
                break;
            default:
                System.out.println("This is fruit");
                // no break required coz this is last statement
        }


        // 3rd
//        int day = in.nextInt();
//        switch (day) {
//            case 1 -> { // curly braces if multiple print statements.
//                System.out.println("Monday");
//            }
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        // 4th
//        int day = in.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }

        // 5th
//        int day = in.nextInt();
//        switch (day) {                   // alt + enter while selecting switch for enhanced switch case.
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("WeekDay");
//                break;
//            case 6:
//            case 7:
//                System.out.println("WeekEnd");
//                break;
//        }

        // 6th
        int day = in.nextInt();
        switch (day) {                   // alt + enter while selecting switch for enhanced switch case.
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDay");
            case 6, 7 -> System.out.println("WeekEnd");
        }
    }
}



/*
Syntax :

switch (expression){

    // cases
    case one;
        //do something
        break;

    case two;
        // do something
        break;

    default
        // do something
}

// Note :
- cases have to be the same type as expressions, must be a constant a literal.
- duplicate case values are not allowed.
- break is used to terminate the sequence.
- if break is not used it will continue to next case.
- default will execute when none of the above does.
- if default is not at the end, put break after it.

*/