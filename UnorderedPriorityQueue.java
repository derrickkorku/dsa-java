public class UnorderedPriorityQueue<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;

    public UnorderedPriorityQueue(int capacity) {
        pq = (Key[]) new Comparable[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(Key key) {
        pq[N++] = key;
    }

    public Key removeMax() {
        int max = 0;

        for (int i = 1; i < N; i++) {
            if (pq[max].compareTo(pq[i]) < 0) {
                max = i;
            }
        }

        return pq[max];
    }
}
