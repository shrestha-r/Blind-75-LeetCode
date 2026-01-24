package LinkedList;



public class MyLinkedList {
    private Node head;
    int size;

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
    public void insertEnd(int value){
        Node newNode = new Node(value);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        size++;
    }
    public void deleteStart(){
        head = head.next;
        size--;
    }

    public void deleteEnd(){
        Node current = head;
        while(current.next.next!=null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public boolean contains(int key){
        Node current = head;
        while(current!=null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
    return false;
    }
    public int getSize(){
        return size;
    }
    @Override
    public String toString() {
        String list = "";
        Node current = head;
        while(current!=null){
            list += current.data + "-->";
            current = current.next;
        }
       return list.substring(0,size*4-3);
    }
    
    
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.insertStart(5);
         list.insertStart(4);
          list.insertStart(3);
          list.insertEnd(3);
          list.deleteStart();
          list.deleteEnd();
          System.out.println(list.contains(3));
          
        System.out.println(list.toString());
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
