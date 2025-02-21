package com.hawk;
import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        int a = 12;
        int b = 21;

        integer(2, 3, 4, 5, 6, 7, 8);
        Stringer("asgh", "asdad", "gghsd", "sqwr");
        multiple(a, b, "asgh", "asdad", "gghsd", "sqwr" );
    }   

    static void integer(int ...a){ // when we dont know how many arguments are going to be passed we use "..." following with any letter "...a" ( a ) in this case.
        System.out.println(Arrays.toString(a));
    }

    static void Stringer(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){ // variable length parameter always should come at the end.
        System.out.println(a +", " + b + ", ");
        System.out.println(v);
    }
}