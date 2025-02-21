package com.hawk;
public class Scope{
    public static void main(String[] args){
        // "a" is available to all which is in the block of "a" ("a" is in the block of main() function. )
        int a = 10;
        int b = 20;
        String name = "Kunal";
        System.out.print(a);
        {
            // Block Scope. its in main() fucntion.
                // int a = 29; // Alredy initialised outside the block in the same method, hence you cannot initialized it again.
                a = 29; // Value can be Modified;
                
                // if you create a variable, it will be only able to use here.

                // Values initialised in this block, will remain in this block only.

                 int c = 99;
        }
        int c = 900; // able to reinitialised coz the variable in the block does not have access outside. So no relation of that outside.
        // System.out.print(c); // error: cannot access outside block function.
        System.out.print(a); // output: 29 

        /*
        things Initialised outside can be use inside, but the things which are initialised inside cannot be use outside.
         */

        // Scoping in for loops
        for (int i = 0; i < 4; i++) {
            int num = 90;
            a = 10000; // outside variable can be able to modify.
        }
//        System.out.println(num); // variable intialized inside loop cannnot be Access outside the loop.
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}