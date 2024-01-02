package Dictionary;

import java.util.Queue;

public class BST<Key extends Comparable<Key>, Value> {
    private Node root = null;

    public Value get(Key key) {
        return get(root, key);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(Key key) {
        return this.get(root, key) != null;
    }

    private Value get(Node x, Key key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            get(x.left, key);
        } else if (cmp > 0) {
            get(x.right, key);
        } else {
            return x.value;
        }

        return null;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null) {
            return new Node(key, value);
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else if (cmp == 0) {
            x.value = value;
        }

        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    public Value min() {
        return min(root);
    }

    private Value min(Node x) {
        if (x == null) {
            return null;
        } else if (x.left == null) {
            return x.value;
        }

        return min(x.left);
    }

    public Value max() {
        return max(root);
    }

    private Value max(Node x) {
        if (x == null)
            return null;

        if (x.right == null) {
            return x.value;
        }

        return max(x.right);
    }

    public Value floor(Key key) {
        Node x = floor(root, key);

        if (x == null)
            return null;

        return x.value;
    }

    private Node floor(Node x, Key key) {
        if (x == null)
            return null;

        int cmp = key.compareTo(x.key);

        if (cmp == 0) {
            return x;
        }

        if (cmp < 0) {
            return floor(x.left, key);
        } else {
            Node t = floor(x.right, key);
            if (t != null) {
                return t;
            } else {
                return x;
            }
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null)
            return 0;

        return x.count;
    }

    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<>();

        inorder(root, queue);

        return queue;
    }

    public void deleteMin() {
        root = deleteMin(root);
    }

    private Node deleteMin(Node x) {

        if (x.left == null)
            return x.right;

        x.left = deleteMin(x.left);

        return x;
    }

    private void inorder(Node x, Queue queue) {
        if (x == null)
            return;

        inorder(x.left, queue);
        queue.enqueue(x.value);
        inorder(x.right, queue);
    }

    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int count;

        Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }
}
