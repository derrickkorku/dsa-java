import java.util.Arrays;

public class PairSum {
    public static int[] findPairSum(int[] arr, int target){
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == target) {
                return new int[]{i, j};
            } else if (arr[i] + arr[j] < target){
                i++;
            } else {
                j--;
            }
        }

        return new int[]{};
    }
}
