public class ClearDigits_3174 {
    public static void main(String[] args) {
        String s = "cb34";
        System.out.print(clearDigits(s));
    }
    public static String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();
        for(char c: s.toCharArray()) {
            if(Character.isDigit(c)) {
                if(!stack.isEmpty()) { // if stack not empty.
                    stack.deleteCharAt(stack.length()-1);
                }
            }else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}
