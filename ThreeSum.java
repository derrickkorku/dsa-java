
/**
 * Given N distinct integers, how many tripplets sum to zero
 */

import java.util.Arrays;

/**
 * Bruteforce solution
 */

class ThreeSum {
    /**
     * T(N) is n^3
     */
    public static int bruteForce(int[] a) {
        int count = 0;

        int N = a.length;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    /**
     * For T(N) to be run in n^2
     */

    public static int improvedThreeSum(int[] a) {
        int count = 0;
        // STEP 1: Sort array in ascending order, a, in T(N) of n^2 using any sorting
        // algorithm(selection,insertion, etc)
        Arrays.sort(a); // Sort array in non-decreasing order

        // STEP 2:
        for (int i = 0; i < a.length - 1; i++) {
            int j = i + 1; // Poiinter to second element
            int k = a.length - 1; // Pointer to last element

            while (j < k) {
                int sum3 = a[i] + a[j] + a[k];
                if (sum3 == 0) {
                    count++;
                } else if (sum3 < 0) {
                    j++;
                } else if (sum3 > 0) {
                    k--;
                }
            }
        }

        return count;
    }
}