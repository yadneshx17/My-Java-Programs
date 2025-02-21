package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.print(Arrays.toString(arr));    
    }
    // MS keep dividing till one element
    static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        // three pointers
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                mix[k] = first[i]; // placing elements in the mix array as per the index of "k"  like from 0 
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++; 
        }

        // it may be possible that one of the arrays is not complete copy the remaining array. 
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;

    }
}