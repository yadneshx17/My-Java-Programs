// This Never Get Fulled.

public class DynamicStack extends CustomStack{

    public DynamicStack() {
        super(); // it will call CustomStack()
    }
    public DynamicStack(int size) {
        super(size); // it will call CustomStack() if not size passed.
    }

    // resizeing it doubling.
    // We cannot use push of parent CustomStack so overridding it to use of Dynamic  stack.
    @Override
    public boolean push(int item) {
        // this takes care of it being full
        if (this.isFull()){
            // double the Array Size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data.
            for (int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point we know that array is not full
        // insert item normally
        return super.push(item);
    }
}