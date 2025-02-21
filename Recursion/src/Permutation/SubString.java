package Permutation;

import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
//        String str = "ba";
//        Char ch = 'c';
//        System.out.println(str.substring(1, 2));
//        System.out.println(str.substring(0, 2));
//        System.out.println(str.substring(0, 2));

        // 1
//        permutations("", "abc");

        // 2
        ArrayList<String> ans = permutationsList("", "abc");
        System.out.println(ans);
    }

    // 1
    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    // 2
    static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>(); // Outerlist.
            list.add(p); // at the end adds all the little permutations list into outer one.
            return list;
        }
        char ch = up.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}