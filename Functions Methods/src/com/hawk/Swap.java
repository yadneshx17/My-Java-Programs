package com.hawk;

public class Swap{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		// 2 - With function
//		swap(a, b);
		
		// 1 - Swap - without using function
		/*
		int temp = a;
		a = b;
		b = temp;
		System.out.print("a =>> " + a + ", b =>> " + b);
		*/


		// 3 - String Swaping
		String name = "Knight Hawk";
		changeName(name);
		System.out.println(name);
	}

	// 2 - Trying Swaping using Function
//	static void swap(int num1, int num2){
//		// this changes will only be valid in this function only..
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;
//		System.out.print("a =>> " + num1 + ", b =>> " + num2);
//	}

	// 3 - String Swaping
	static String changeName(String  name){
		name = "Yadnesh"; // crating a new object.
		return name;
	}
}