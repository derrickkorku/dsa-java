public class ChainingHashTable<Key, Value> {

    private int M;
    private Node[] st = new Node[M];

    private static class Node<Key, Value> {
        private Key key;
        private Value value;
        private Node next;

        Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public Value get(Key key) {
        int i = hash(key);

        for (Node x = st[i]; x != null; x = x.next) {
            if (x.key.equals(key)) {
                return (Value) x.value;
            }
        }

        return null;
    }

    public void put(Key key, Value value) {
        int i = hash(key);

        for (Node x = st[i]; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.value = value;
                return;
            }
        }

        st[i] = new Node(key, value, null);
    }
}
