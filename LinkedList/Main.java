package LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.insertStart("A");
        list.insertStart("B");
        list.insertStart("C");
        list.insertEnd("D");
        System.out.println(list.toString());
        System.out.println("size " + list.getSize());

        list.deleteStart();
        System.out.println(list.toString());
        System.out.println("size " + list.getSize());

        list.deleteEnd();
        System.out.println(list.toString());
        System.out.println("size " + list.getSize());
        System.out.println(list.contains("D"));

    }
}
