package Patterns;

public class Triangle {
    public static void main(String[] args){
        triangle2(4, 0);
    }

    static void triangle(int r, int c){
        if (r == 0){
            return;
        }
        if (c < r){
            System.out.print("*");
            triangle(r, c + 1);
        } else {
            System.out.println(); // when coloums finished for that row this prints a new line.
            triangle(r - 1, 0); // next row
        }
    }

    // when calls are returning back tab print hoga.
    // jab saab calls finishing hoge aur stack se bahar nikalte vkt print statement execute hoga.
    static void triangle2(int r, int c){
        if (r == 0){
            return;
        }
        if (c < r){
            triangle(r, c + 1);
            System.out.print("*");
        } else {
            triangle(r - 1, 0); 
            System.out.println(); 
        }
    }
}