package Stack.wArray;
import Array.MyList;

public class StackArray<T> {
    private MyList stack;
    private int size;
    public StackArray(){
        stack = new MyList<>(0);
    }
    public void push(T value){
        stack.append(value);
        size++;
    }
   public void pop(){
        stack.pop();
    }
}
