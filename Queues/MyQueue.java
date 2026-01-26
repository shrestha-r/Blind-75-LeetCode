package Queues;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    private int size;
    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;


        public QueueNode(T data){
            this.data = data;
        }

    }
    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T data){
        QueueNode<T> new_node = new QueueNode<>(data);
        if(last != null){
            last.next = new_node;
        }
        last = new_node;
        if(first == null){
            first = last;
        }
        size ++;
    }
    public T remove(){
        if(first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        if(first == null){
            last = null;
        }
        size --;
        return data;
        
    }
    public T peek(){
        if(first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString(){
        if(first == null) return "Empty Queue";
        QueueNode<T> current = first;
        String queue = "";
        while(current.next != null){
            queue+= current.data + "| ";
            current = current.next;
        }
        queue+= current.data + "|";
        return queue;

    }
}
