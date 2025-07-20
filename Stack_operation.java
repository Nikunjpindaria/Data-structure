// Stack.java

public class Stack_operation {
    private int maxSize;
    private int[] stack;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stack[++top] = value;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        System.out.println("Stack Underflow");
        return -1;
    }

    public int peek() {
        return isEmpty() ? -1 : stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop()); // 20
    }
}
