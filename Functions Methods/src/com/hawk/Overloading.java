public class Overloading{
    public static void main(String[] args){
        /*
        Function Overloading means having functions with Same name with Different Arguments.
        */

        fun(33);
        fun("Hawk");
        
        // fun(); // cannot call by empty parameter coz compiler will confuse which to call.
        
        sum(35, 64);
        sum(67, 34, 97);
    }
    
    // Different Parameters.
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    
    // Same Type of Parameter's but Different Number of Arguments.
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b;
    }  
}