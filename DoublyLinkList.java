class DoublyLinkList<T> implements Iterable<T> {
    private int size = 0;

    private Node<T> head = null;
    private Node<T> tail = null;

    private class Node<T>{
     T data;
     Node<T> prev, next;
     public Node(T data, Node<T> prev, Node<T> next){
         this.data = data;
         this.prev = prev;
         this.next = next;
     }

     @Override public String toString(){
         return data.toString();
     }
    }

    public void clear(){
        Node<T> trav = head;

        while(trav != null){
            Node<T> next = trav.next;
            trav.next = trav.prev = null;
            trav.data = null;
            trav = next;
        }

        head = tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void addFirst(T elem){
        if (isEmpty()){
            head = tail = new Node<T>(elem, null, null);
        } else {
            head.prev = new Node<T>(elem, null, head);
            head = head.prev;
        }

        size++;
    }

    public void addLast(T elem){
        if (isEmpty()){
            head = tail = new Node<T>(elem, null, null);
        } else {
            tail.next = new Node<T>(elem, tail, null);
            tail = tail.next;
        }

        size++;
    }

    public T peekFirst(){
        if (isEmpty()) throw new RuntimeException("Empty List");
        return head.data;
    }

    public T peekLast(){
        if (isEmpty()) throw new RuntimeException("Empty List");
        return tail.data;
    }

    public T removeFirst(){
        if (isEmpty()) throw new RuntimeException("Empty List");
        T d = head.data;
        head = head.next;
        head.prev = null;

        if (isEmpty()) tail = null;

        size--;
        return d;
    }

    public T removeLast(){
        if (isEmpty()) throw new RuntimeException("Empty List");
        T d = tail.data;
        tail = tail.prev;
        tail.next = null;

        if (isEmpty()) head = null;
        
        size--;
        return d;
    }

    public T remove(Node<T> node){
        if (node.prev == null){
            removeFirst();
        } else if (node.next == null) {
            removeLast();
        }

        T d = node.data;

        node.next.prev = node.prev;
        node.prev.next = node.next;

        node.prev = node.next = null;
        size--;

        return d;
    }

    public T removeAt(int index){
        if (index < 0 || index > size) throw new IllegalArgumentException();

        int i;
        Node<T> trav;

        if (index < size / 2){
            for (i = 0, trav = head;  i != index; i++){
                trav = trav.next;
            }
        } else {
            for (i = size - 1, trav = tail; i != index; i--){
                trav = trav.prev;
            }
        }

        return remove(trav);
    }

}
