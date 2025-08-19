public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed into the stack.");
        }
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from the stack.");
            return poppedValue;
        }
    }

    // Display stack elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from empty stack
    }
}
