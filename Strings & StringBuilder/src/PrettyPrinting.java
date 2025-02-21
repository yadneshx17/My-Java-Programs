public class PrettyPrinting {
    public static void main(String[] args) { 
        // Print only till two decimals.
        // float a = 453.1246f;
        float a = 453.1276f; // ouput : .13 it also round off the value.
        // System.out.printf("Formatted number is %.2f", a);

        System.out.println(Math.PI);
        System.out.printf("Pie: %.3f", Math.PI); // till three decimals

        // %s --> there are many placeholder like this in java and also python and other langs.
        // System.out.print("Hello my name is %s and i am %s", "Kunal", "Cool");
        

    }
}