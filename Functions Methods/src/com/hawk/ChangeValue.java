package com.hawk;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 45, 6};
        change(array);
        System.out.println(Arrays.toString(array));
    }
    static void change(int[] arr) {
        arr[0] = 999; // if you make a change to the object via this ref variable, same object will be changed.
    }
}
