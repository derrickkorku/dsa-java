public class SinglyLinkedList<T> {

    public class Node<T> {
        public T value;
        public Node next;

        public void Node(T value) {
            this.value = value;
        }
    }

    Node head = null;

    public void add(T value) {
        Node<T> n = new Node<T>(value);

        if (head == null) {
            n.next = head;
            head = n;
        } else {
            Node<T> current = head.next;
            while (current != null) {
                current = current.next;
            }
            current.next = n;
        }
    }

    public boolean search(T value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

}