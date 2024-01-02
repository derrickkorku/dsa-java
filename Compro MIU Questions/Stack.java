/**
 * Implement the stack datastructure
 */
class Stack {
    private int capacity;
    private int top;
    private int[] stack;

    Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    boolean push(int item) {
        if (this.capacity - 1 == top) {
            throw new RuntimeException("Stack is Full");
        }

        this.stack[++this.top] = item;
        return true;
    }

    int pop() {
        if (this.top == -1) {
            throw new RuntimeException("Stack is Empty");
        }

        return this.stack[this.top--];
    }

    int peek() {
        if (this.top == -1) {
            throw new RuntimeException("Stack is Empty");
        }

        return this.stack[this.top];
    }
}