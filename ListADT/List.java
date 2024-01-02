/**
 * List with Doubly Link List
 */
public class List {
    private Node _header;
    private Node _trailer;
    private int _size;

    List() {
        _size = 0;
        _header = new Node();
        _trailer = new Node();

        _linkNodes(_header, _trailer);
    }

    public int size() {
        return _size;
    }

    public boolean isEmpty() {
        return _size == 0;
    }

    public Position first() {
        if (_header._next == _trailer) {
            throw new Error("List is Empty");
        }

        return _header._next;
    }

    public Position last() {
        if (_trailer._prev == _header) {
            throw new Error("List is Empty");
        }

        return _trailer._prev;
    }

    public boolean isFirst(Position p) {
        return _header._next == p;
    }

    public boolean isLast(Position p) {
        return _trailer._prev == p;
    }

    public Position before(Position p) {
        Node temp = ((Node) p)._prev;
        if (temp == _header) {
            throw new Error("List is Empty");
        }

        return temp;
    }

    public Position after(Position p) {
        Node temp = ((Node) p)._next;
        if (temp == _trailer) {
            throw new Error("Empty List");
        }

        return temp;
    }

    public Object replaceElement(Position p, Object e) {
        Object oldE = p.element();

        ((Node) p)._elem = e;

        return oldE;
    }

    public void swapElement(Position p, Position q) {
        Object temp = p.element();

        ((Node) p)._elem = q.element();
        ((Node) q)._elem = temp;
    }

    public Position insertAfter(Position p, Object e) {
        Node afterNode = ((Node) p)._next;

        Node newNode = new Node();
        newNode._elem = e;

        _linkNodes((Node) p, newNode);
        _linkNodes(newNode, afterNode);

        _size++;

        return newNode;
    }

    public Position insertBefore(Position p, Object o) {
        Node beforeNode = ((Node) p)._prev;

        Node newNode = new Node();
        newNode._elem = o;

        _linkNodes(newNode, (Node) p);
        _linkNodes(beforeNode, newNode);

        return newNode;
    }

    public Position insertFirst(Object e) {
        return insertAfter(_header, e);
    }

    public Position insertLast(Object e) {
        return insertBefore(_trailer, e);
    }

    public Object remove(Position p) {
        Node prevNode = ((Node) p)._prev;
        Node nextNode = ((Node) p)._next;

        _linkNodes(prevNode, nextNode);

        Node n = (Node) p;
        n._prev = null;
        n._next = null;

        return p.element();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<<");

        Node currNode = _header._next;

        if (currNode != _trailer) {
            sb.append(currNode.element());
            currNode = currNode._next;
        }

        while (currNode != _trailer) {
            sb.append(", " + currNode.element());
            currNode = currNode._next;
        }

        sb.append(">>, size is" + size());

        return sb.toString();
    }

    private void _linkNodes(Node p, Node q) {
        p._next = q;
        q._prev = p;
    }

    private static class Node implements Position {
        private Object _elem;
        private Node _prev;
        private Node _next;

        @Override
        public Object element() {
            return _elem;
        }

        @Override
        public String toString() {
            return element().toString()
        }

    }

}
