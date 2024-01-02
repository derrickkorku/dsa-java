public class BinarySearchRecursion {
    public static int binarySearch(Comparable[] arr, Comparable target, int lo, int hi) {
        if (hi <= lo)
            return -1;

        int mid = lo + (hi - lo) / 2;

        int cmp = target.compareTo(arr[mid]);

        if (cmp == 0)
            return mid;
        else if (cmp > 0) {
            return binarySearch(arr, target, mid + 1, hi);
        } else {
            return binarySearch(arr, target, lo, mid);
        }
    }
}