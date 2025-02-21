package introduction;

public class Main {
    public static void main(String[] args) {


        // CREATING OBJECTS.
//        Student hawk; // declaring a reference variable of type Student
//        hawk = new Student(); // initialise - allocate a Student object

        // one liner - creating object.
//      In the line [ Student hawk = new Student(); ] , hawk is a reference variable that refers to an object of type Student.
        // Student() - is an constructor.
        Student hawk = new Student();

        // initialised - instance variables. ( allocating values )
        // if this values was not being initialised default values which are in class under Student() constructor will be printed.
        // hawk object ke liye instance var ki values set ki gayi hai .
        hawk.rno= 13;
        hawk.name = "Knight hawk";
        hawk.marks = 88.5f;


        // Displaying the initialized values
        // ye statements pehle object mein dekhega ki variables ki values di hai ya nhi agar nhi di hogi toh class mein check karega for default values.
        System.out.println(hawk.rno);    // output: 13
        System.out.println(hawk.name);   // output: Knight hawk
        System.out.println(hawk.marks);  // output: 88.5
    }
}

// Create a Class
// Datatype for every single student123 etc.
class Student {
    // Instance variables
    int rno;      // Roll numb\]er
    String name;  // Student name
    float marks;  // Marks obtained

    // Constructor( is just a function ) - with default values
    // return type is Class itself.
    // When a Student object is created without explicitly setting these instance variables, the constructor will initialize them with these default values.
    Student() {
        this.rno = 17;
        this.name = "Yadnesh";
        this.marks = 87.8f;
    }
}

// EXTRA NOTES : https://chatgpt.com/share/e1a91f56-ce2c-4681-8b68-b4121558fbc9
/*
The hawk object's instance variables rno, name, and marks are explicitly set to 13, "Knight hawk", and 88.5f, respectively.
If the instance variables were not explicitly set, the Student constructor would initialize them with the default values: 17, "Yadnesh", and 87.8f.

When you write Student hawk;, you are declaring a reference variable of type Student.
This line does not create a new Student object; it simply declares a variable named hawk that can hold a reference to a Student object.

Student hawk = new Student(13, "Knight Hawk", 88.5f); creates a new Student object and calls the constructor with the specified values.
The constructor assigns these values to the instance variables of the hawk object using the this keyword.
When you print hawk.rno, hawk.name, and hawk.marks, you see the values 13, "Knight Hawk", and 88.5f respectively, which were assigned in the constructor.
*/
