public class Main {
    public static void main(String[] args) {

//        Three types of String buffer.
        // constructor 1 : Default Capacity of Stringbufer obj -- > 16
        StringBuffer sb = new StringBuffer();

        // constructor 2 : Direct String is Passed
        StringBuffer sb2 = new StringBuffer();

        // constructor 3 : Specified the Capacity
        StringBuffer sb3 = new StringBuffer(30);

        // Methods.
        sb.append("Hawk"); // adds in the obj
        sb.append(" is hacker "); // not create new obj just add in it only

//        sb.insert(2, "Hawk"); // insert at paritcular index.

        sb.replace(0, 4, "Knight"); // 0-3

        sb.delete(1,4);

        sb.reverse();

        System.out.println(sb.capacity());

        String str = sb.toString();
        System.out.println(str);
    }
}
