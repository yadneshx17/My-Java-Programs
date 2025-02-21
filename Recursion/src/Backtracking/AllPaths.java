package Backtracking;

// From Here Backtracking is working.
import java.util.Arrays;


public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        // 1
//        allPath("", board, 0, 0);

        // 2
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }

    // 1
    static void allPath(String p, boolean[][] maze, int r, int c ){
        if( r == maze.length - 1 && c == maze[0].length - 1){ // == 2
            System.out.println(p);
            return;
        }

        // If it visited - maze[r][c] will get false.
        if(!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;

        if( r < maze.length - 1)    { // < 2
            allPath(p + 'D', maze, r+1, c);
        }
        if( c < maze[0].length - 1 ) { // < 2
            allPath(p + 'R', maze, r, c+1);
        }
        if( r > 0){
            allPath(p + 'U', maze, r-1, c);
        }
        if( c > 0){
            allPath(p + 'L', maze, r, c-1);
        }
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that functon
        // back tracking - reversing the changes.
        maze[r][c] = true;
    }

    // 2 - Steps + Matrix(path).
    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step; // when at the ans/last/finish line cell this gives the step no too that cell
            for(int[] arr : path) { // prints the matrix ( see debugging )
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p); // prints the "DDRR" type path/Directions.
            System.out.println(); // prints new line
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false; // makes false the current cell
        path[r][c] = step; // Gives Step's number to the current cell.

        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }// ex: for "DDRU" first ans path: jab 2,2 ke liye yaha se call hota hai then return statement ke baad iske bahar nikal ta hai then niche jata.

        if (r > 0) {
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;

    }
}