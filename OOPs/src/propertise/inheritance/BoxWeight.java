package propertise.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
//      Although a subclass includes all of the members of its superclass, it cannot access those members of the superclass that have been declared as private.
        // can't access its private.
//        this.l;
    }

    // constructor that takes two argument which are passed from lower class.
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }



    BoxWeight(double l, double h, double w, double weight) {
        // used to initialise values preset in parent class.
        super(l, h, w); // call the parent class constructor.

        // both child and parent has weight variable
        // but you specifically want to access the variable of  parent can use "super." for this.
        System.out.println(super.weight);

        this.weight = weight;

    }




}