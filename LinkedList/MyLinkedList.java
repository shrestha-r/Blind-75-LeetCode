package LinkedList;

public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        size = 0;
    }

    public void insertStart(int value) {
        Node current = new Node(value);
        current.next = head;
        head = current;
        size++;
    }

    public void insertEnd(int value) {
        Node newNode = new Node(value);
        Node current = head;
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
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public boolean contains(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String list = "";
        Node current = head;
        while (current != null) {
            list += current.data + "-->";
            current = current.next;
        }
        return list.substring(0, size * 4 - 3);
    }
}
