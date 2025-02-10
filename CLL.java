public class CLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void addToFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void deleteNode(Node node) {
        if (node == null) return;

        if (node == head) {
            head = node.next;
            tail.next = head;
        }
        if (node == tail) {
            tail = node;
        }
        Node current = head;
        while (current.next != node) {
            current = current.next;
        }
        current.next = node.next;
    }

    public void displayForward() {
        Node current = head;
        while (current.next != head) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.addToFront(1);
        cll.addToFront(2);
        cll.addToFront(3);
        cll.addToFront(4);
        cll.addToFront(5);
        cll.addToEnd(6);
        cll.addToEnd(7);
        cll.addToEnd(8);
        cll.addToEnd(9);
        cll.addToEnd(10);
        cll.displayForward();
        cll.deleteNode(cll.head);
        cll.displayForward();
        cll.deleteNode(cll.tail);
        cll.displayForward();
    }
}
