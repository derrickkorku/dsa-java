import java.util.*;

/**
 * Find the maximum value of the product of 2 numbers in an array
 * 
 * @author Derrick Korku
 */
class MaxProduct {

    public static double maxProduct(int[] arr) {
        int size = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] * arr[j] > max) {
                    max = arr[i] * arr[j];
                }
            }
        }

        return max;
    }

    public static double maxProduct2(int[] arr) {
        int size = arr.length;

        Arrays.sort(arr);

        double max = arr[size - 1] * arr[size - 2];
        double min = arr[0] * arr[1];

        if (max > min) {
            return max;
        } else {
            return min;
        }
    }

    public static void main(String[] args) {

    }
}