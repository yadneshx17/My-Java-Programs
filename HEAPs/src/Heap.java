import java.util.ArrayList;

java.util.ArrayList;

public class Heap<T extends Comparable> {

    private ArrayList<T> list;

    // constructor
    public Heap() {
       list = new ArrayList<>();
    }

    // Swap Function.
    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    // these return ke baad ke formulas are for arrays that starts from 0.
    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index){
        return index * 2 + 1;
    }

    private int right(int index){
        return index * 2 + 2 ;
    }

    //  value is inserted at last of the list.
    private void insert(T value) {
        list.add(value);
        upheap(list.size() - 1); // passes the last value  of the list which is the value we inserted.
    }
    // Upheap -  To restore the heap property after an insertion. If the heap property is violated (e.g., in a max-heap, if the new element is greater than its parent), swap them. Continue this process until the heap property is restored or the element becomes the root.
    private void upheap(int index){
        // if empty
        if(index == 0){
            return;
        }
        // Compare the newly added element with its parent.
        int p = parent(index);

        if(list.get(index).compareTo(list.get(p)) < 0){ //  If list.get(index) is less than list.get(p), compareTo() returns a negative value.
            // < 0 checks if the element at index is smaller than the element at p. In a min-heap, this condition indicates that the element at index is smaller than its parent at p, so they should be swapped.
            swap(index, p);
            upheap(p);
        }
    }

    public T remove() throws Exception {
        // if empty
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        // item which is being removed is stored in this variable.
        T temp = list.get(0);

        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) { // if list is not empty
            list.set(0, last); // last wala root  ko assign hota hai concept padho heap ka.
            downheap(0);
        }

        // prints the removed item.
        return temp;
    }

    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;   // changing to value as per the condition satisfied value
        }
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if(min != index) {  // When the value is not same this means any one if condition is being satisfied.
            swap(min, index);
            downheap(min);
        }
    }
}