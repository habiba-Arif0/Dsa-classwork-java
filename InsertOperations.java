class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class InsertOperations {
    Node head;

    void insertAtBeginning(int d) {
        Node n = new Node(d);
        n.next = head;
        head = n;
    }

    void insertAtEnd(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = n;
    }

    void insertAtPosition(int d, int pos) {
        Node n = new Node(d);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;
        n.next = temp.next;
        temp.next = n;
    }

    void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertOperations l = new InsertOperations();
        l.insertAtBeginning(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);
        l.insertAtPosition(15, 2);
        l.display();
    }
}
