package introduction.Staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // propertise which are not related to any object, and is common to all the objects of the class is declared as " static ".
    static long population;

    // static so not dependent on objects of human class.
    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here cause this is non-static.
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        // So it is not related to any object.
        // insted of this keyword we can put name of the class "Human".
        Human.population += 1;


        // static method can be use using class name.
        Human.message();
    }
}