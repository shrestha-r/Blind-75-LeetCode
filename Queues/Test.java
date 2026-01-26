package Queues;

public class Test {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(5);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println(queue.toString());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.toString());
        System.out.println(queue.size());
    }
}
