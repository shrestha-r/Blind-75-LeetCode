package Stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        // System.out.println(stack.peek());
        // System.out.println(stack.isEmpty());

        System.out.println(stack.toString());

    }
}
