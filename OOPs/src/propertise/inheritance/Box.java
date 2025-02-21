package propertise.inheritance;

public class Box {

    // super(); // calls to Object class

    // Anything which is private you can only use it in that file only.
//    private double l;
    double l;
    double h;
    double w; // width
    double weight; // for use case of super.weight

    // constructor without any argument.
    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // Constructor with one argument
    Box (double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    // Constructor with Three argument
    Box (double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // Constructor that intake object of type Box
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }







}
