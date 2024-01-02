package Dictionary;

public class RedBlackTreeBST<Key, Value> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private boolean isRed(Node x) {
        if (x == null)
            return false;

        return x.color == RED;
    }

    private class Node {
        Key key;
        Value value;
        boolean color;
        Node left, right;
    }
}
