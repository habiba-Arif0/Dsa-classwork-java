public class Queue {
    int front = -1, rear = -1, size = 5;
    int[] arr = new int[size];

    boolean isFull() { return rear == size-1; }
    boolean isEmpty() { return front == -1 || front > rear; }

    void enqueue(int x) {
        if(isFull()) { System.out.println("Queue Overflow"); return; }
        if(front == -1) front = 0;
        arr[++rear] = x;
    }

    void dequeue() {
        if(isEmpty()) { System.out.println("Queue Underflow"); return; }
        System.out.println("Removed: " + arr[front++]);
    }

    void display() {
        if(isEmpty()) { System.out.println("Queue is empty"); return; }
        for(int i=front;i<=rear;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
