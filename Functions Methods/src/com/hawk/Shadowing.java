package com.hawk;
// Shadowing occurs when a variable declared in an inner scope has the same name as a variable in an outer scope.

public class Shadowing {
	// class variable.
	static int x = 90; // this is going to be shadowed by x in main().

    public static void main(String[] args){
		System.out.println(x); // output : 90
		x = 40; // The class variable ( x = 90; )is shadowed by this.
		System.out.println(x); // output : 40  
        fun();
	}
	
	static void fun(){
		System.out.println(x); // output : 90
	}
}

/*
https://chatgpt.com/share/622ef828-6322-4212-af44-0b724b0465ef

In Java, shadowing occurs when a variable declared within a certain scope (e.g., a method, constructor, or inner block)
has the same name as a variable declared in an outer scope.
The inner scope variable "shadows" or "hides" the outer scope variable.

*/

