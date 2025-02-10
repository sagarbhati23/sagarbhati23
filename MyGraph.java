// Graph implementation using linkedlist in java
public class MyGraph {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node[] nodes;
    private int size;

    public MyGraph(int size) {
        this.size = size;
        nodes = new Node[size];
    }

    public void addEdge(int source, int destination) {
        Node newNode = new Node(destination);
        newNode.next = nodes[source];
        nodes[source] = newNode;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            Node current = nodes[i];
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyGraph graph = new MyGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.display();
    }
}
