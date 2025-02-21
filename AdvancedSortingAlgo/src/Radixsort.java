import java.util.*;

// https://chatgpt.com/share/d6c290db-ff7c-4ed5-ad8a-d9cbfd1a3001

public class Radixsort {
    public static void main(String[] args) {
        int[] arr = {29, 83, 471, 36, 91, 8};

        System.out.println("Origin array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {
        // get the maximum element.
        int max = Arrays.stream(arr).max().getAsInt();

        // do count sort for every digit place
        for(int exp = 1; max/exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // The output array will hold the sorted array after processing the current digit.
        int[] count = new int[10]; // The count array is used to store the frequency of each digit (0-9) at the current digit place.

        Arrays.fill(count, 0); // This line sets all elements of the count array to 0.

        // Counting Digits: This loop calculates the frequency of each digit in the current digit place (exp).
        for(int i=0; i<n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        System.out.println("\nCount array for " + exp + " : " + Arrays.toString(count));

        for(int i=1; i<10; i++) {
            count[i] = count[i] + count[i-1];
        }

        System.out.println("Updated count array " + Arrays.toString(count));

        for(int i=n-1; i>=0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.out.println("Output array " + Arrays.toString(output));

        System.arraycopy(output, 0, arr, 0, n);

    }
}