public class Main {
    public static void main(String[] args) {
        // pattern1(5);    
        // pattern2(5);    
        // pattern3(5);    
        // pattern4(5);    
        // pattern5(5);    
        // pattern28(5);    
        // pattern30(5);    
        pattern17(5);    
        pattern31(5);    

    }
    // Pattern - 1
    /*
    * * * * * 
    * * * * *   
    * * * * * 
    * * * * * 
    * * * * * 
    */
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col.
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    // PATTERN - 2
    /*
    * 
    * * 
    * * * 
    * * * * 
    * * * * *
    */
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // PATTERN - 3
    /*
    * * * * * 
    * * * * 
    * * * 
    * * 
    *   
    */
    static void pattern3(int n ) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print("* ");                
            }
            System.out.println();
        }
    }

    // PATTERN - 4
    /*
    1 
    1 2 
    1 2 3 
    1 2 3 4 
    1 2 3 4 5
    */
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    
    // PATTERN - 5
    /*
    * 
    * * 
    * * * 
    * * * * 
    * * * 
    * * 
    *
     */
    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            // for every row, run the col
            int totalColsinRow = row > n ? 2*n - row: row;
            for (int col = 0; col < totalColsinRow; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    // Pattern 28
    /*
        * 
       * * 
      * * * 
     * * * * 
    * * * * * 
     * * * * 
      * * * 
       * * 
        * 
     */
    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsinRow = row > n ? 2 * n - row: row;

            int noofSpaces = n - totalColsinRow;
            for (int s = 0; s < noofSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsinRow; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    // PATTERN 30
    /*
            1 
          2 1 2 
        3 2 1 2 3 
      4 3 2 1 2 3 4 
    5 4 3 2 1 2 3 4 5 
     */
    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
    
    // Pattern 17
    /*       
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4  
5 4 3 2 1 2 3 4 5 
  4 3 2 1 2 3 4 
    3 2 1 2 3 
      2 1 2 
        1 
     */
    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    // PATTERN 31
    /*
    5 5 5 5 5 5 5 5 5 5 5 
    5 4 4 4 4 4 4 4 4 4 5 
    5 4 3 3 3 3 3 3 3 4 5 
    5 4 3 2 2 2 2 2 3 4 5 
    5 4 3 2 1 1 1 2 3 4 5 
    5 4 3 2 1 0 1 2 3 4 5 
    5 4 3 2 1 1 1 2 3 4 5 
    5 4 3 2 2 2 2 2 3 4 5 
    5 4 3 3 3 3 3 3 3 4 5 
    5 4 4 4 4 4 4 4 4 4 5 
    5 5 5 5 5 5 5 5 5 5 5 
     */
    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
