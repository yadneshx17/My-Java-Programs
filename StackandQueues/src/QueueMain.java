public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(75);
//        queue.insert(655);
//        queue.insert(52);
//        queue.insert(4523);
//        queue.insert(2);
//
//        queue.display();
//        System.out.println(queue.remove());
//        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(75);
        queue.insert(655);
        queue.insert(52);
        queue.insert(4523);
        queue.insert(2);

        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}