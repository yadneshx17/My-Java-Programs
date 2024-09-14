import java.util.Arrays;

public class CountSort {
    public static void countsort(int[] array){
        if(array == null | array.length <= 1) {
            return;
        }

        // Getting Maximum value.
        int max = array[0];
        for (int num : array){
            if(num > max){
                max = num;
            }
        }

        // creating frequency array.
        int[] countArray = new int[max + 1];

        for(int num : array){ // traversing OG array
            countArray[num]++; // jo number hoga uske index pe count increase hoga.
        }

        int index = 0;
        for(int i = 0; i<=max; i++) {
            while (countArray[i] > 0) { // jabtak count hai tabtak
                array[index] = i;
                index++;
                countArray[i]--;

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}