/**
 * Question 2
 * 
 * Search in a bitonic array. An array is bitonic if it is comprised of an
 * increasing sequence of integers followed immediately by a decreasing sequence
 * of integers. Write a program that, given a bitonic array of nn distinct
 * integer values, determines whether a given integer is in the array.
 * 
 * Standard version: Use ∼3lg⁡n∼3lgn compares in the worst case.
 * 
 * Signing bonus: Use ∼2lg⁡n∼2lgn compares in the worst case (and prove that no
 * algorithm can guarantee to perform fewer than ∼2lg⁡n∼2lgn compares in the
 * worst case).
 */
public class SearchBitonicArray {
    // Algorithm
    // Step 1: Bineary search Find peak (the largest element) element
    // Step 2: Binary Search increasing part of array
    // Step 3: Bineary Search decreasing part of array

    public static boolean searchBitonicArray(int[] arr, int target) {
        int peak = findPeakElement(arr);
        int index = binarySearch(arr, target, 0, peak, true);
        if (index != -1) {
            return true;
        }
        index = binarySearch(arr, target, peak + 1, arr.length - 1, false);
        return index != -1;
    }

    public static int findPeakElement(int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (a[mid] < a[mid + 1]) {
                lo = mid + 1;
            } else if (a[mid] > a[mid + 1]) {
                hi = mid;
            }
        }

        return lo;
    }

    public static int binarySearch(int[] a, int target, int lo, int hi, boolean isIncreasing) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (a[mid] == target) {
                return mid;
            }

            if (isIncreasing) {
                if (a[mid] > target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            } else {
                if (a[mid] < target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        return -1;
    }
}
