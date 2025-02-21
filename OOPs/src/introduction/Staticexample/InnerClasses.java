package introduction.Staticexample;

// This InnerClass is the Outer class means it is not inside any other class.
// outside classess cannot be static
// outside the class cannot be staic
// only inner classes can be static

public class InnerClasses {
	// Test (innerclass) - depenedent on outer class( InnerClasses )
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}

//static class A {
//
//}