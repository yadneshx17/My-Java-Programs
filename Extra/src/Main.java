import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // HackerRank - Loop-II
        /*
            2
            0 2 10
            5 3 5
        */
        Loop();



    }

    public static void formattedPrint() {
        // System.out.printf() function to print formatted output.
        Scanner in = new Scanner(System.in);
        System.out.print("================================\n");
        for (int i = 0; i < 3; i++) {
            String str = in.next();
            int num  = in.nextInt();

            System.out.printf("%-15s%03d%n", str, num);
        }
        System.out.print("================================");
        in.close();
    }

    public static void Loop() {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}