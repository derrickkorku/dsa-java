/**
 * Using Recursive Function, find number of times value appear in array
 */
public class NumberOfTimesValueAppearInArray {
    public static int find(int[] arr, int value, int ind) {

        if (arr.length == 0 || ind >= arr.length) {
            return 0;
        }

        if (arr[ind] == value) {
            return 1 + find(arr, value, ++ind);
        } else {
            find(arr, value, ++ind);
        }

        return 0;
    }
}
