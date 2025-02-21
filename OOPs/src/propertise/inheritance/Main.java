package propertise.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(box1); // passing object of type Box.
        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        // You can only access extra variables; child can access extra variable that are in the parent.
        // but if the object is directly created of parent class it will not able to access the child propertise.
//        System.out.println(box1.weight);

        // passing values to parent class and child class.
        // referencing child to a child
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(1, 2, 3, 4); // initialsing the values of parent class too.
//        System.out.println(box3.h + " " + box3.weight);
//        System.out.println(box4.h + " " + box4.weight);


        // It is important to understand that it is the type of the reference variable—not the type of the object that it refers to—that determines what members can be accessed.
//        When a reference to a subclass object is assigned to a superclass reference variable, you will have access only to
//        those parts of the object defined by the superclass.
        // referencing child object to parent.
        Box box5 = new BoxWeight(2, 3, 4, 5);
//        System.out.println(box5.h); // can access the members of superclass.
//        System.out.println(box5.weight); // cannot access cox weight property does not exist in the superclass.


        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight.
        // hence, you should have access to weight variable, jo ref ka type hai uske variable access kar sakte.
        // this also means, that the ones you are trying to access should be initialised.
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class. you are not able to initialise the weight variable coz you called the constructor of parent class. parent class has no idea  about weight.
        // this is why error is.
        // referencing child to a parent object.
//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6.weight);

        // ctrl + click
        BoxPrice box = new BoxPrice(5, 8, 200);
    }





}




