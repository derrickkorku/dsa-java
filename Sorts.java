public class Sorts {

    public static void insertionSort(Comparable[] a) {
        int N = a.length - 1;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    exch(a, i, j);
                }
            }
        }
    }

    public static void selectionSort(Comparable[] a) {
        int N = a.length - 1;

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < i + 1; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }

            exch(a, i, min);
        }
    }

    public static void shellSort(Comparable[] a) {
        int N = a.length - 1;
        int h = 1;

        while (h < N / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            /**
             * H-sort array
             */

            for (int i = h; i < N; i++) {
                // Complete logic later
            }
            h = h / 3;
        }
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            if (!less(a[i], a[i - 1]))
                return false;
        }

        return true;
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    /**
     * Merge Sort
     */

    private static Comparable[] aux;

    public static void merge(Comparable[] arr, int mid, int lo, int hi) {
        // Merge a[lo, mid] with a[mid, hi] into aux[0, hi - lo]
        int i = lo, j = mid, N = hi - lo;

        for (int k = 0; k < N; k++) {
            if (i == mid) {
                aux[k] = arr[j++];
            } else if (j == hi) {
                aux[k] = arr[i++];
            } else if (arr[j].compareTo(arr[i]) < 0) {
                aux[k] = arr[j++];
            } else {
                aux[k] = arr[i++];
            }
        }

        // Copy back array
        for (int k = 0; k < N; k++) {
            arr[lo + k] = aux[k];
        }
    }

}