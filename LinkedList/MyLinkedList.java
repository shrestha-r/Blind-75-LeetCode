package LinkedList;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        size = 0;
    }

    public void insertStart(T value) {
        Node<T> current = new Node<>(value);
        current.next = head;
        head = current;
        size++;
    }

    public void insertEnd(T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public void deleteStart() {
        head = head.next;
        size--;
    }

    public void deleteEnd() {
        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public boolean contains(T key) {
        Node<T> current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String list = "";
        Node<T> current = head;
        while (current != null) {
            list += current.data + "-->";
            current = current.next;
        }
        return list.substring(0, size * 4 - 3);
    }
}
