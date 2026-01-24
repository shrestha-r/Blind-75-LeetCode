package LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.insertStart(5);
        list.insertStart(4);
        list.insertStart(3);
        list.insertEnd(3);
        System.out.println(list.toString());
        System.out.println("size " + list.getSize());

        list.deleteStart();
        System.out.println(list.toString());
        System.out.println("size " + list.getSize());

        list.deleteEnd();
        System.out.println(list.toString());
        System.out.println("size " + list.getSize());
        System.out.println(list.contains(5));

    }
}
