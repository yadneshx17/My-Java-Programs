package propertise.polymorphism;

public class Numbers {
    // Compile time / Static Polymorphism
    // Method OverLoading.
    // -> same name of the method but arguments , return type, ordering of the dataype in argument is different.

    double sum(double a, int b) {
            return a + b;
    }

    double sum(int a, int b) {
            return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(2, 3);
        obj.sum(1, 3, 7);

//        obj.sum(4, 5, 6, 8);
    }
}
