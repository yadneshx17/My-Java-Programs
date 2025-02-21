package com.hawk;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensions{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        /* 
            1 2 3
            4 5 6
            7 8 9
        */

        // int[][] arr = new int[3][];
        
        // int[][] arr2d = {
            //     {1, 2, 3},
            //     {4, 5, 6},
            //     {7, 8, 9}
            // };
            
        // int[][] arr2D = {
            // {1, 2, 3}, // 0th index
            // {4, 5},     // 1st index
            // {6, 7, 8, 9} // 2nd index -> arr2D[2] = {6, 7, 8, 9 } 
            // };
                
            
        int[][] arr = new int[3][];
        // int[][] arr = new int[3][2];
        System.out.print(arr.length); // prints no of row's 
        
        // INPUT.                                            
        for (int row = 0; row < arr.length; row++){
                // for each column in row's
	        for (int col = 0; col < arr[row].length; col++ ){
                arr[row][col] = in.nextInt();
	        }
        }

        // OUTPUT
        // for (int row = 0; row < arr.length; row++){
            //     // for each column in row's
        //     for (int col = 0; col < arr[row].length; col++ ){
        //         System.out.print(arr[row][col] + ""]);
        //     }
                // System.out.println( );
        // }

        // OUTPUT - 2nd Method.
        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row])); // arr[0], arr[1], arr[2].
        }

        


    }
}