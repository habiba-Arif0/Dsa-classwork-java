class DNode {
    int data;
    DNode prev, next;

    DNode(int d) {
        data = d;
        prev = next = null;
    }
}

public class DoublyLinkedList {
    DNode head;

    void insert(int d) {
        DNode n = new DNode(d);
        if (head == null) {
            head = n;
            return;
        }
        DNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = n;
        n.prev = temp;
    }

    void display() {
        DNode t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        d.insert(10);
        d.insert(20);
        d.insert(30);
        d.display();
    }
}
