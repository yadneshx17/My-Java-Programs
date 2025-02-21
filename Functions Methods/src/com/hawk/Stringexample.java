import java.util.Scanner;

public class Stringexample {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.print(message);   

        // Taking input 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = in.next();
        String personalised = myGreet(name);

        // String personalised = myGreet("Hawk");
        System.out.println(personalised);
    }
    
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
    

    // static String greet() {
    //     String greeting = "How are you?";
    //     return greeting;
    // }
}