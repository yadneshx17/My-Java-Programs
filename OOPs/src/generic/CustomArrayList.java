package generic;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];

    }

    public void add(int num) {
        if (isFull()){
            resize();
        }
        data[size++] = num; // insert num in array.
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the current items in the new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int remove = data[--size];
        return remove;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int size(){
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        WildCardExample list = new WildCardExample();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);



    }
}