package propertise.polymorphism;

public class Circle extends Shapes{

    // This will run when obj of circle is created.
    // hence it is overriding the parent method.
    // this method is same in parent class too.
    // if wanna see if the method  is overridden or not just put that annotation
    @Override // This is called annotation
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
