public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        /// this takes care of it being full
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for(int i = 0; i < data.length; i++) {
                temp[i] = data[(front + 0) % data.length];
            }
            // position at new array.
            front = 0;
            end = data.length;
            data = temp;
        }
        // at this point we know that array is not full
        // insert item
        // insert normally
        return super.insert(item);
    }
}