public class LinkedListStack<T> {
    private Node _head = null;

    public boolean isEmpty() {
        return _head == null;
    }

    public void push(T item) {
        Node oldHead = _head;

        _head = new Node(item);
        _head._next = oldHead;
    }

    public T pop() {
        T item = (T) _head._item;

        _head = _head._next;

        return item;
    }

    private class Node<T> {
        private T _item;
        private Node _next;

        Node(T item) {
            _item = item;
        }
    }
}
