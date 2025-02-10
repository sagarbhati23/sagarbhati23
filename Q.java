import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Q {
    private LinkedList<Integer> queue;

    public Q() {
        queue = new LinkedList<>();
    }

    // Enqueue operation
    public void enqueue(int element) {
        queue.addLast(element);
    }

    // Dequeue operation
    public int dequeue() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.removeFirst();
    }

    // Peek operation
    public int peek() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        Q queue = new Q();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());
    }
}
