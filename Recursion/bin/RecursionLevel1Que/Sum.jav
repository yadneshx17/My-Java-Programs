package RecursionLevel1Que;

public class Sum {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }

    static int sum(int n) {
        if(n <= 1){
        return 1;
        }
        return n + fact(n-1);
    }
}