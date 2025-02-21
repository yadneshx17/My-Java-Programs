import java.util.Scanner;

public class DiffCol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][];
        
        // Initialize each row with a specific number of columns
        arr[0] = new int[3]; // First row with 3 columns
        arr[1] = new int[4]; // Second row with 4 columns
        arr[2] = new int[2]; // Third row with 2 columns

        // INPUT
        for (int row = 0; row < arr.length; row++) {
            // for each column in row's
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
    }
}