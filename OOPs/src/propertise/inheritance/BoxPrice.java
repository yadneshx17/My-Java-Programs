package propertise.inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice() {
        super(); // this will call the constructor( which is with no arguments) of BoxWeight class.
        this.cost = -1;
    }

    // 1
    BoxPrice(BoxPrice other) {
//        super(other);
        this.cost  = other.cost;
    }

    // 2
    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    // 3
    public BoxPrice(double side, double weight, double cost) {
        super(side, weight); // passing above classes.
        this.cost = cost;
    }


}





