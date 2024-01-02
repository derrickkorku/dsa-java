/**
 * Max Priority Queue Implementation using heap-ordered binary
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;

    MaxPQ(int capacity) {
        pq = (Key[]) new Comparable[capacity + 1];
    }

    public void insert(Key key) {
        pq[++N] = key;
        swim(N);
    }

    public Key removeMax() {
        Key max = pq[1];

        swap(1, N--);

        sink(1);

        pq[N + 1] = null;

        return max;
    }

    public void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            swap(k, k / 2);
            k = k / 2;
        }
    }

    public void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;

            if (j < N && less(j, j + 1))
                j++;

            if (!less(k, j))
                break;

            swap(k, j);
            k = j;
        }
    }

    public void swap(int i, int j) {
        Key temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    public boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }
}
