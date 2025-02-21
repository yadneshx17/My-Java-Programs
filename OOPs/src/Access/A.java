package Access;

public class A {
    // num variable is private so it can be access in this file only.
    private int num;
//    int num;
    String name;
    int[] arr;

    // You can use private variables using getters and setters.
    // this getNum() method is public so it can be access from anywhere.
    public int getNum() {
        // num variable is private so it can be access in this file only.
        return num;
    }


    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[34];

    }
}
