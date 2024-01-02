import java.util.Collections;
import java.util.PriorityQueue;

public class DynamicMedian {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;
    private boolean even;

    DynamicMedian() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
        even = true;
    }

    public void insert(int value) {
        if (even) {
            // Insert into min heap if even
            minHeap.offer(value);
        } else {
            // Insert into max heap if odd
            maxHeap.offer(value);
        }

        even = !even;
    }

    public double findMedian() {
        if (even) {
            return (double) (maxHeap.peek() + minHeap.peek() / 2.0);
        } else {
            return (double) maxHeap.peek();
        }
    }

    public void removeMedian() {
        if (even) {
            maxHeap.poll();
            minHeap.poll();
        } else {
            maxHeap.poll();
        }

        even = !even;

        // Rebalance heap
        if (maxHeap.size() > minHeap.size()) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
}
