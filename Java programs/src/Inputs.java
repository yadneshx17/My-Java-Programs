import java.util.Scanner;

    public class Inputs {
        public static void main(String[] args) {
            System.out.print("Enter a number: ");
            Scanner input = new Scanner(System.in);
//        System.out.print("Please Enter some input: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is " + rollno);

//        int a = 234_000_000; // underscore replace with comma.

//          Final Variables : you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)

/*        
          final int myNum = 15;
          myNum = 20;  
*/


            // String
//        String name = input.nextLine();
//        System.out.println(name);
            // Float
            float marks = input.nextFloat();
            System.out.println("Your Float value is>>> " + marks);

        }
    }



