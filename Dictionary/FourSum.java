package Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 1.
 * Question 1
 * 
 * 4-SUM. Given an array a[ ]a[] of nn integers, the 4-SUM problem is to
 * determine if there exist distinct indices ii, jj, kk, and ll such that
 * a[i]+a[j]=a[k]+a[l]a[i]+a[j]=a[k]+a[l]. Design an algorithm for the 4-SUM
 * problem that takes time proportional to n2n2 (under suitable technical
 * assumptions).
 */
public class FourSum {
    public static boolean isFourSum(int[] arr) {
        HashMap<Integer, List<Integer[]>> map = new HashMap<>();

        int n = arr.length;

        /**
         * Compute all pairwise sums and store them in a hash table
         */
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i != j) {
                    int sum = arr[i] + arr[j];

                    if (!map.containsKey(sum)) {
                        map.put(sum, new ArrayList<>());
                    }

                    map.get(sum).add(new Integer[] { i, j });
                }
            }
        }

        /**
         * Check for distinct pairs that are equal
         */
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i != j) {
                    int sum = arr[i] + arr[j];

                    if (map.containsKey(sum)) {
                        for (Integer[] pair : map.get(sum)) {
                            int k = pair[0];
                            int l = pair[1];

                            if (k != i && k != j && l != i && l != k) {
                                return true;
                            }
                        }
                    }

                }
            }
        }

        return false;
    }
}
