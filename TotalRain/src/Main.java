import java.util.Arrays;

public class Main {
    public static int totalRain(int[] heights){
        if (heights == null || heights.length <= 2){
            return 0;
        }

        int max = 0;
        int N = heights.length;
        int[] left = new int[N];
        int[] right = new int[N];

        max = heights[0];
        left[0] = max;

        for (int i = 1; i < N; i++){
            if (heights[i] > max){
                max = heights[i];
            }

            left[i] = max;
        }

        System.out.println(Arrays.toString(left));
        max = heights[N - 1];
        right[N - 1] = max;

        for (int i = N - 2; i >= 0; i--){
            if (heights[i] > max){
                max = heights[i];
            }

            right[i] = max;
        }

        System.out.println(Arrays.toString(right));

        System.out.println(Math.min(left[0], right[0]));

        int result = 0;

        for (int i = 0; i < N; i++){
            result += (Math.min(left[i], right[i]) - heights[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        int myArr[] = { 5, 1, 2, 4, 4, 4, 3, 1, 0, 0, 0 }; // should be 5
        System.out.println(totalRain(myArr));
    }
}