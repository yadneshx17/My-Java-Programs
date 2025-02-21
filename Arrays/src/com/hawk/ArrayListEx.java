import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args){
        
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5); 

        list.add(76);
        list.add(456);
        list.add(72346);
        list.add(62762347);
        list.add(671236);
        list.add(7236);
        list.add(9567);
        list.add(345);
        list.add(236);


        System.out.println(list.contains(65));
        System.out.println(list.contains(345));

        System.out.println(list);
        list.set(0, 69); // Sets value 99 to oth index in the array list.
        System.out.println(list);


        // INPUT
        // for i   
    }
}
