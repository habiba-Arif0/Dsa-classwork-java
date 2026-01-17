public class StackArray {

    private int[] stack;
    private int top;
    private int size;

    public StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // PUSH
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    // POP
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // PEEK
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    // ISEMPTY
    public boolean isEmpty() {
        return top == -1;
    }

    // DISPLAY
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // MAIN
    public static void main(String[] args) {
        StackArray s = new StackArray(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        s.pop();
        s.display();

        System.out.println("Top element: " + s.peek());
    }
}
