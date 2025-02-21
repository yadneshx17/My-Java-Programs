package com.hawk;

public class Array {
    public static void main(String[] args) {
        // Array ==>> collection of datatypes.
        
        // syntax
        // datatype[] variable_name = new datatype[size];
        
        // 1st method.
        int[] rnos = new int[5]; // internally [0, 0, 0, 0, 0] , 5 sizes.

        // 2nd Method : directly assigning values.
        int[] rnos2 = {23, 12, 45, 32, 15};
        // int[] rnos2 = {23, 12, "Hawk", 32, 15};  // cannot store more than one datatype in arrays.

        
        // Declaration of array: ros (ref var)is getting defined in the stack.
        int[] ros;  // by default value of ref var is null.
        
        // initialisation: actual here object is being created in the memory(heap).
        ros = new int[5];  // internally [0, 0, 0, 0, 0]  5 sizes.
        System.out.println(ros[1]); // ouput : 0

        
        // String Array.
        String[] arr = new String[4];
        System.out.println(arr[0]); // output: null

        // Enhanced for Loop.
        for(String element : arr) {
            System.out.println(element);
        }
    }

} 