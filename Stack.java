class Stack {
    private int capacity;
    private int top;
    private int array[];

    Stack(int capacity) {
        this.capacity = capacity;
        this.array = new int[this.capacity];
        this.top = -1;
    }

    public void push(int item) {
        if (capacity - 1 == top) {
            throw new RuntimeException("Stack is full");
        }
        array[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        return array[top--];
    }

    public int peek() {
        return arr[top];
    }
}