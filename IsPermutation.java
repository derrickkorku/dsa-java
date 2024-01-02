import java.util.Arrays;

/**
 * 2.
 * Question 2
 * 
 * Permutation. Given two integer arrays of size nn, design a subquadratic
 * algorithm to determine whether one is a permutation of the other. That is, do
 * they contain exactly the same entries but, possibly, in a different order.
 */
public class IsPermutation {
    public static boolean isPermutation(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
