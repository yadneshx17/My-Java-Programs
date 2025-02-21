package introduction;

public class Wrapperclass {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;
//        it will not swap
        https://chatgpt.com/share/7cfa6d5c-5b29-4c78-9211-bb13ad0dfa26

//        pass-by-value means that when you pass a variable to a method, you are passing a copy of the value of that variable.

        swap(a, b);
        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3;

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name";

        // when a non primitive is final, you cannot reassign it.
//        kunal = new A("new object");

//        A obj = new A("Anything");
//        System.out.println(obj.name);

//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A("Random name");
//        }
    }




    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}



class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }


    // Garbbage Collection stuff
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
}