public class Comparison {
    public static void main(String[] args) {

        String a = "Hawk";
        String b = "Hawk";
        String c = a; // this also pointing to same object.
    
        // == operator
        // System.out.println(a == b); // output : true
        // System.out.println(c == a); // output : true


        // We will not use this method cause we are going to use string pool.
        String name1 = new String("Hawk");
        String name2 = new String("Hawk");
        // System.out.println(name1 == name2);

    //  .equals() --> method or function. 
        // just cares about the value, check's if same or not.
        System.out.println(name1.equals(name2));
  
        System.out.println(name1.charAt(0)); 
    }
}
