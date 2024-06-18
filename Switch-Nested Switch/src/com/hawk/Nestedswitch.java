package com.hawk;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        // 1st
        switch (empID){
            case 1:
                System.out.println("Yadnesh Tambe");
                break;
            case 2:
                System.out.println("Knight hawk");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Entered ");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

        // 2nd
        switch (empID) {
            case 1 -> System.out.println("Yadnesh Tambe");
            case 2 -> System.out.println("Knight hawk");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Entered ");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }




    }
}