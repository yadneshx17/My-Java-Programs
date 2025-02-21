import java.lang.reflect.Array;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        // Operator " +  " - > in java only defined for primitives or for complex objects too but any one value should be strings.


        // for chars ->  adding the ascii or something values of this charcters.
        // System.out.print('a' + 'b');

        // for Strings -> concatenate.
        // System.out.print("a" + "b");    

        // add the ascii or something values of this letters.
        // System.out.print('a' + 3); // a + bcd
        System.out.print((char)'a' + 3); // a + bcd ascii value add hori
        // System.out.print('a' + 1); // ascii value mein + 1 add hora.
        // System.out.print((char)('a' + 1)); // a mein b add kiya and chracter print kiya toh b 
        
        
        // System.out.print("a" + 1); 
        //
        

        // when there is Object toString method is called on it and string value is returned.
        // System.out.println("Hawk" + new ArrayList<>());
        // System.out.println("Hawk" + new Integer(56));

        // System.out.println("a" + 'b'); // string will be not converted to any data type & if one of the datatype is string, ans will be string.

    }
}
