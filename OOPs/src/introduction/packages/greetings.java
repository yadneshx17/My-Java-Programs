package introduction.packages; // mentioning where this java file lies. like iits in packages under OOps folder.

// need to import if it is in another package/folder.
// from where the function will get the location of the message() function.
import static OOPs.introduction.packages.Message.message;

// outside this file only those function have public only those can be accessed this.
public class greetings {
    public static void main(String[] args) {
        System.out.println("I am hawk");
        message();
    }

}

