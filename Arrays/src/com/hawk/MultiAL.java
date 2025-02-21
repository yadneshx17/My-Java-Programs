import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initilisation.
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); // 0, 1, 2 pe 3 new ArrayList banegi
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
