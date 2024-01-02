import java.util.EmptyStackException;

public class StackNode<T> {
    private class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T d){
            this.data  = d;
        }
    }

    private Node<T> top;
    
    public T pop(){
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item){
        Node<T> n = new Node<T>(item);
         n.next = top;
         top = n;
    }

    public T peek(){
        if (top == null) throw new EmptyStackException();

        T item = top.data;
        return item;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
