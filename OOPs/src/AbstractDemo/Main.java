package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.career();

        Daughter daughter = new Daughter(76);
        daughter.career();

        // you cannot create objects of abstract classes.
//    Parent mom = new Parent(23) {
//        if i able to create and obj of abstract class and i call the career function i will get an error that body is not there
        // that's why we can also not create abstract constuctor

        // but can be use as ref.
//        Parent daughter = new Daughter(76);



        Parent.hello();

    }
}