package solution;

class MyStack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // -1 indicates the stack is empty
    }

    // Push: Adds an element to the top
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Pop: Removes and returns the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek: Returns the top element without removing it
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }

    // isEmpty: Checks if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // isFull: Checks if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Helper method to display current stack elements
    public void display() {
        System.out.print("Stack: [");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + (i == top ? "" : ", "));
        }
        System.out.println("]");
    }
}

public class StackDemo {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        // Push 5 elements
        int[] toPush = {10, 20, 30, 40, 50};
        System.out.print("Pushed: ");
        for (int val : toPush) {
            stack.push(val);
            System.out.print(val + " ");
        }

        // Peek
        System.out.println("| Peek: " + stack.peek());

        // Pop 3 elements
        System.out.print("Popped: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(stack.pop() + " ");
        }

        // Print current state
        System.out.print("| ");
        stack.display();
    }
}
