class Node {
    Node next = null;
    int data;

    Node(int d){
        data = d;
    }

    void appendToTail(int d){
        Node newNode  = new  Node(d);
        Node head = this;

        while(head.next != null){
            head = head.next;
        }

        head.next = newNode;
    }

    Node deleteNode(Node head, int d){
        Node n = head;

        if (n.data == d) {
            return n.next;
        }

        while (n.next != null) {
            if (n.next.data == d) {
                return n.next.next;
            }
        }

        return n;
    }
}