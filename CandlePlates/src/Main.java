import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static int[] find(String s, int[][] queries){
        if (s == null || s.isEmpty()) return new int[]{};

        int n = s.length();

        int[] prefixSum = new int[n];
        prefixSum[0] = s.charAt(0) == '*' ? 1 : 0;

        int[] leftCandle = new int[n];
        leftCandle[0] = s.charAt(0) == '|' ? 0 : -1;

        int[] rightCandle = new int[n];

        for (int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i - 1] + (s.charAt(i) == '*' ? 1 : 0);
            leftCandle[i] = s.charAt(i) == '|' ? i : leftCandle[i - 1];
        }

        rightCandle[n - 1] = s.charAt(n - 1) == '|' ? (n - 1) : n;

        for (int j = n - 2; j >= 0; j--){
            rightCandle[j] = s.charAt(j) == '|' ? j : rightCandle[j + 1];
        }

        int[] result = new int[queries.length];

        int i  = 0;
        for (int[] q : queries){
            int start = rightCandle[q[0]];
            int end = leftCandle[q[1]];

            result[i] = start >= end ? 0 : prefixSum[end] - prefixSum[start];
            i++;
        }

        return result;
    }
    public static void main(String[] args) {
        int[][] arr = new int[1][1];

        arr[0] = new int[]{2, 5};
        find("**|**|***|", arr);
    }
}