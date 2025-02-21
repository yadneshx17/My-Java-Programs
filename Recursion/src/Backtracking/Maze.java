package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // 1
//       System.out.print(count(3, 3));
        // 2
//         path("", 3, 3);
        // 3
//        ArrayList<String> ans = pathRet("", 3, 3);
//        System.out.println(ans);
        // 4
//        ArrayList<String> ans2 = pathRetDiagonal("", 3, 3);
//        System.out.println(ans2);
        // 5 - 3x3 maze
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("", board, 0, 0);


    }

    // 1
   static int count(int r, int c){
       if ( r == 1 || c == 1){
           return 1;
       }
       int left = count(r-1, c); // Down
       int right = count(r, c-1); // Right
       return left + right;
   }

   // 2
   static void path(String p, int r, int c ) {
       if( r == 1 && c == 1){
           System.out.println(p);
           return;
       }
       if( r > 1){
           path(p + 'D', r-1, c);
       }
       if( c > 1){
           path(p + 'R', r, c-1);
       }
   }

   // 3 - Adding and Returning Path in Array List.
   static ArrayList<String> pathRet(String p, int r, int c ) {
       if (r == 1 && c == 1) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
       }
       ArrayList<String> list = new ArrayList<>();
       if( r > 1){
           list.addAll(pathRet(p + 'D', r-1, c));
       }
       if( c > 1){
           list.addAll(pathRet(p + 'R', r, c-1));
       }
       return list;
   }

   // 4 - Adding and Returning Path with Diagonal too.. in Array List. till here all are 321 321.
   static ArrayList<String> pathRetDiagonal(String p, int r, int c ) {
       if (r == 1 && c == 1) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
       }
       ArrayList<String> list = new ArrayList<>();
       if( r > 1 && c > 1){
           list.addAll(pathRetDiagonal(p + 'D', r-1, c-1));
       }

       if( r > 1){
           list.addAll(pathRetDiagonal(p + 'V', r-1, c));
       }

       if( c > 1){
           list.addAll(pathRetDiagonal(p + 'H', r, c-1));
       }
       return list;
   }

   // 5
   static void pathRestrictions(String p,boolean[][] maze, int r, int c ){
       if( r == maze.length - 1 && c == maze[0].length - 1){ // both should be true.
           System.out.println(p);
           return;
       }
       // river/Restricted Cell.
       if(!maze[r][c]) { // if maze cell false, return from there.
           return;
       }
       // for row.
       if( r < maze.length - 1) {
           pathRestrictions(p + 'D', maze, r + 1, c);
       }
       // for columns.
       if( c < maze[0].length - 1) {
           pathRestrictions(p + 'R', maze, r, c+1);
       }
   }
}









