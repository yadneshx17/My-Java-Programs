package RecursionArrayQue;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 6, 5};
        // 1
        // System.out.println(find(arr, 4, 0));
        // 2
        // System.out.println(findIndex(arr, 4, 0));
        // 3
        // System.out.println(findIndexLast(arr, 4, arr.length - 1));

        // 4   - return an array list
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);

        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
        System.out.println(ans);

    }
    // 1
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    // 2
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        } else {
            return findIndex(arr, target, index+1);
        }
    }

    // 3
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1){ // ulta ayega toh  zero ko check karke exceed karega left mein.
            return -1;
        }
        if(arr[index] == target){
            return index;
        } else {
            return findIndexLast(arr, target, index-1);
        }
    }

    // 4 - return an array list
    // All ocurrences. 
    // List is updating outside, no newlist is being created.
    // nothing is returning void
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index); // add's element in the array list.
        }
        findAllIndex(arr, target, index + 1);
    }

    // 5 - list in the argument 
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) { // when index outof bound return.
            return list; //return and it will come out from where it was called.
        }
        if (arr[index] == target) {
            list.add(index);  //adding in a same object just via different ref variable.  
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    // 6th return the list without passing in the argument.
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}