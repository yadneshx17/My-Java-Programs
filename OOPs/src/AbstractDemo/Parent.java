package AbstractDemo;

// Multiple inheritance cant allowed needed interfaces to do it.

// Any class that contains one or more abstract methods must also be declared abstract.
public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    // static in abstract class
    static void hello(){
        System.out.println("Hey");
    }


    // not providing body
    // if you definitly know that the functions that are in the parent class needs to be overridden.
    abstract void  career();
    abstract void  partner();
}

/*
 cannot create abstract constructors

Abstract static methods cannot be made
abstract is made to be overridden and static can't be overridden common sense.




*/