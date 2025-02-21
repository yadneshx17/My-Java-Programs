public class Infinite {
    public static void main(String[] args) {
        int[] arr = { 3,   5,   7,   9,   10, 90,
            100, 130, 140, 160, 170 };
        int target = 10;

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // first find the range
        // firstly start with a box of size of 2
        int start = 0;
        int end = 1;
        
        // condition for the target to lie in the range.
        // target < end.
        // we dont need to check if target is greater than or not of start.

        while( target > arr[end]) {
            int newStart = end + 1; // this is my new start.
            // double the box value
            
            // Formula for End
            // end = previous end + sizeofBox * 2
            end =  end + (end - start + 1) * 2; 
            start = newStart;
        }
    
        return binarySearch(arr, target,start, end);
    }

    static int binarySearch(int[] arr, int target, int start , int end) {
    
        while (start <= end){

            // BEST FORMULA.
            int mid = start + (end - start) / 2;
           
            if (target < arr[mid]){ // Mid ka index jayega arr mein.
                end = mid - 1; // left side. start same end mid - 1 ayega.

            } else if (target > arr[mid]){ 
                start = mid + 1;

            } else {
                // ans found   
                return mid;
            }
        }    
        return -1;  
    }
}