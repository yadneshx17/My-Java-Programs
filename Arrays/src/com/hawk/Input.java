package com.hawk;

import java.util.Arrays;
import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ----------Array of Primitives------------------
        // int[] arr = new int[5];
        // arr[1] = 45;
        // arr[2] = 23;
        // arr[0] = 23;
        // arr[3] = 233;
        // arr[4] = 543;
        // internally it's stored like this >> [25, 45, 23, 233, 543]
        // System.out.println(arr[3]);
        // System.out.println(arr[5]); // out of bound error coz nothing exist's on index 5 in array.

        // easy method to print array.
        // System.out.println(Arrays.toString(arr));

        // inputs using for loops.
        // for (int i = 0; i < arr.length; i++){
        //     arr[i] = in.nextInt();
        // }

        // for (int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + "");
        // }

        // enhanced method. for each loop.
        // for(int num : arr){ // every element in array, print the element.
            // System.out.println(num + " "); // here num represents element of the array.



        // -------Arrays of Objects---------
        String[] str = new String[4];
        for (int i = 0; i <  str.length; i++){
            str[i] = in.next();
        
        }
        System.out.println(Arrays.toString(str));
        
        // modify
        str[1] = "Hawk";
        System.out.println(Arrays.toString(str));
    }
}