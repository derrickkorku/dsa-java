public class MaxSumSubArrayOfSizeK {
    public static int findSum(int[] arr, int k) throws Exception {
        if (k <= 0 || k >= arr.length){
            throw new Exception("Invalid Input K");
        }

        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k - 1; i++){
            currentSum += arr[i];
        }

        maxSum = currentSum;

        for (int i = k; i < arr.length - 1; i++){
            currentSum = currentSum + arr[i] - arr[i - k];

            if (currentSum > maxSum){
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
