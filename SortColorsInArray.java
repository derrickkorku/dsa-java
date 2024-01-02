/**
 * 3.
 * Question 3
 * 
 * Dutch national flag. Given an array of nn buckets, each containing a red,
 * white, or blue pebble, sort them by color. The allowed operations are:
 * 
 * swap(i,j)swap(i,j): swap the pebble in bucket ii with the pebble in bucket
 * jj.
 * 
 * color(i)color(i): determine the color of the pebble in bucket ii.
 * 
 * The performance requirements are as follows:
 * 
 * At most nn calls to color()color().
 * 
 * At most nn calls to swap()swap().
 * 
 * Constant extra space.
 */
public class SortColorsInArray {
    // Let 0 = red, 1 = white and 2 = pebble
    public static void sortColors(int[] colors) {
        int low = 0;
        int mid = 0;
        int hi = colors.length - 1;

        while (mid <= hi) {
            if (colors[mid] == 0) {
                swap(colors, low, mid);
                low++;
                mid++;
            } else if (colors[mid] == 1) {
                mid++;
            } else {
                swap(colors, mid, hi);
                hi--;
            }
        }
    }

    private static void swap(int[] colors, int i, int j) {
        int temp = colors[i];
        colors[i] = colors[j];
        colors[j] = temp;
    }
}
