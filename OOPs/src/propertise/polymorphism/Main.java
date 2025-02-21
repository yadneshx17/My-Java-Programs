package propertise.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();


        // in Method  overriding: type of method is called depend on the type of the object.
        // yea but we learnt that it depends upon ref var type lets see the working in video.

         // What is able to access is detemine by the type of reference variable which one is able to access is defined by type of the object.

        // will not call the parent class area method
        // whatever the object type is use uska hi method  run hoga.

        // This is calling the method area which is in Circle class
        // so cant we remove the method area which is in Shapes class.\
        // no it can't if the ref type is Shapes, it will only access which is accessble in Shapes. shapes does not have any idea what is below it.
        // so " Shapes refVar = " says that we know that we can access method called "area"(coz it is in Parent class :Shapes.).
        // but Which version of the method should be called/access is defined by the type of the object.
        // " = new ObjType "


        circle.area();


        shape.area();
        square.area();

    }
}
