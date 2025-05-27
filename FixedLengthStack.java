package Stack;

public class FixedLengthStack implements Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public FixedLengthStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }
    @Override
    public void push(int element) {
        if(top == capacity-1){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = element;
    }
    @Override
    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
    @Override
    public int size() {
        return top + 1;
    }
}
