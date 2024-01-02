import java.util.NoSuchElementException;

public class QueueNode<T> {
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T d){
            this.data = d;
        }
    }


    Node<T> first;
    Node<T> last;

    public void add(T item){
        Node<T> n = new Node<T>(item);

        if (last != null){
            last.next = n;
        }

        last = n;

        if (first == null){
            first = last;
        }
    }

    public T remve(){
        if (first == null) throw new NoSuchElementException();
        T item = first.data;
        first = first.next;
        if (first == null){
            last = null;
        }

        return item;
    }


    public T peek(){
        if (first == null) throw new NoSuchElementException();

        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }
}