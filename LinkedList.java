class LinkedList {
    Node head;

    /** Node class */
    class Node {
        Node next;
        int data;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void push(int data){
        Node tempNode = new Node(data);
        tempNode.next = head;
        head = tempNode;
    }

    int count(int d){
        Node current = head;
        int count = 0;
        while(current != null){
            if (current.data == d){
                count++;
            }
            current = current.next;
        }

        return count;
    }

    /* Driver function to test the above methods */
    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();
 
        /* Use push() to construct below list
          1->2->1->3->1  */
        llist.push(1);
        llist.push(2);
        llist.push(1);
        llist.push(3);
        llist.push(1);
 
        /*Checking count function*/
        System.out.println("Count of 1 is " + llist.count(1));
    }
}