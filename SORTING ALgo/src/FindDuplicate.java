// Q 287 | https://leetcode.com/problems/find-the-duplicate-number/
// Asked in Microsoft && Amazon.

public class FindDuplicate {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if (arr[i] != i + 1){ // checking if the element and the index on which the element is equal index +1 or not. checking if the element is on correct index or not.
                int correct = arr[i] - 1; 
                if (arr[i] != arr[correct]) { // checking if there is element present on the correct index or not  
                    swap(arr, i, correct); // if not present --> swap.
                } else {
                    return arr[i]; // if present so the element on the wrong index is the ans.
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    // swap function.
    static void swap(int[] arr, int first, int second){ 
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}