public class DigitProd {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.print(ans);
    }
    static int sum(int n) {
        if (n%10 == n){
            return n;
        }
        return (n % 10) * sum(n / 10);
    }
}
