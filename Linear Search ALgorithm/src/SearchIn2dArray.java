import java.util.Arrays;

public class SearchIn2dArray{
    public static void main(String[] args){
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        int target = 56;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target){
        // for rows.
        for (int row = 0; row < arr.length; row++) {
            // for columns.
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target ){
                    return new int[]{row, col}; // here its like where the array is initialised. so in order to create a object we write like "new int[]{row,col}"
                }    
            }
        }
        return new int[]{-1, -1}; 
    }

    // MAx Value
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        // for rows.
        for (int[] ints: arr){
            for (int element : ints){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}