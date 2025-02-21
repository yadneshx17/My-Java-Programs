public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    // COnstructors
    public CustomStack(){
        this(DEFAULT_SIZE); // this use to call as a constructor with default size if size is not specific.
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    // Methods
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++; // pointer will increase by one
        data[ptr] = item; // item will get added
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from and Empty stack");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws StackException{ // what is at the top
        if (isEmpty()){
            throw new StackException("Cannot peek from and Empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; //  ptr is at last index.
    }
    private boolean isEmpty() {
        return ptr == -1;
    }


}