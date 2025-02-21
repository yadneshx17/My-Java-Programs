import java.util.*;

public class InBuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(4);
//        stack.push(52);
//        stack.push(74);
//        stack.push(34);
//        stack.push(674);
//        stack.push(561);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        // poping out from empty stack gives error.
//        System.out.println(stack.pop());


        // QUEUES
        Queue<Integer> queue = new LinkedList<>();
//        queue.add(75);
//        queue.add(655);
//        queue.add(52);
//        queue.add(4523);
//        queue.add(2);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        // Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(23);
        deque.addLast(52);
        deque.removeFirst();
        // etc etc
    }
}

