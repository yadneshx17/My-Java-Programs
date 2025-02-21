public class Plain {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPlaindrome(str));
    }
    static boolean isPlaindrome(String str) {
        if ( str == null || str.length() == 0) {
            return true;
        }

        str = str.toLowerCase();
        for(int i = 0; i <= str.length() / 2; i++){ // 0 to 3 
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true; 
    }
}