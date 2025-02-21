package Strings;

public class Stream{
    public static void main(String[] args){
        // 1
        // skip("", "baccadh");
        // 2
        System.out.println(skip("baccadh"));

        System.out.println(skipApple("bacapplcdah"));
    }

    // p - processed
    // up - unprocessed ( original )
    // 1
    static void skip(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }
    
    // 2
    static String skip(String up) {
        if(up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1)); // while going up add my data.
        }
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    
}