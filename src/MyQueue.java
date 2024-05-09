import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
