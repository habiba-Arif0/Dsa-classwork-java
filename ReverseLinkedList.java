class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class ReverseLinkedList {
    Node head;

    void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        ReverseLinkedList l = new ReverseLinkedList();
        l.head = new Node(1);
        l.head.next = new Node(2);
        l.head.next.next = new Node(3);

        l.reverse();
        l.display();
    }
}
