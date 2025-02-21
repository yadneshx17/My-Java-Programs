public class OddEven {
    public static void main(String[] args) {
        int n = 23;

        System.out.println(oddEven(n));
    }
    private static boolean oddEven(int n) {
        return ((n & 1) == 0);
    }
}