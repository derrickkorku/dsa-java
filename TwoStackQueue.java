import java.util.Stack;

public class TwoStackQueue<T> {
    private Stack<T> inbox = new Stack<T>();
    private Stack<T> outbox = new Stack<T>();

    public void enqueue(T elem) {
        inbox.push(elem);
    }

    public T dequeue() {
        if (outbox.empty()) {
            while (!inbox.empty()) {
                outbox.push(inbox.pop());
            }
        }

        return outbox.pop();
    }
}
