import java.util.Arrays;

public class Queue {
    private int front = -1;
    private int rear = 0;
    private int size = 0;
    private int capacity = 2;
    private int[] arr = new int[capacity];

    public void enqueue(int obj) {
        if (isFull()) {
            this.resize();
        }

        System.out.println("Adding item " + obj);
        this.arr[this.rear] = obj;
        this.rear = (this.rear + 1) % this.capacity;
        this.size++;
    }

    private void resize() {
        System.out.println("Resizing queue.");
        this.capacity = this.arr.length * 2;
        this.arr = Arrays.copyOf(this.arr, this.capacity);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        }

        this.front = (this.front + 1) % this.capacity;

        System.out.println("Removing item at position " + this.front);
        int item = this.arr[this.front];
        this.size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        }

        System.out.println("Returning item at position " + (this.front + 1) % this.capacity);
        int item = this.arr[(this.front + 1) % this.capacity];
        return item;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.capacity == this.size;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        return "Queue has size: " + this.size() + ", is full status is " + this.isFull() + ", is empty status is "
                + this.isEmpty() + ", capacity is " + this.capacity;
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(1);
        System.out.println(q);

        q.enqueue(4);
        System.out.println(q);

        q.enqueue(10);
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q);

        q.enqueue(13);
        System.out.println(q);

        q.dequeue();
        System.out.println(q);
    }
}
