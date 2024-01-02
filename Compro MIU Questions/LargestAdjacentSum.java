class LargestAdjacentSum {
    public static Integer findLargestAdjacentSum(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        int max = arr[0] + arr[1]; // Assume the sum of the first 2 numbers to be the largest sum

        /**
         * Iterate the array starting from the 3rd number and ending at the last but 1
         * if any 2 adjacent numbers greater than already computed sum, make it the new
         * sum
         */
        for (int i = 2; i < arr.length - 2; i++) {
            if (arr[i] + arr[i + 1] > max) {
                max = arr[i] + arr[i + 1];
            }
        }

        return max;
    }
}