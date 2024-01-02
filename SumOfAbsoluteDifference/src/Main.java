public class Main {
    public static int findSumOfAbsoluteDifference(int[] A){
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;

        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++){
            int a = A[i];

            max1 = Math.max(max1, a + i);
            min1 = Math.min(min1, a + 1);

            max2 = Math.max(max2, a - i);
            min2 = Math.min(min2, a - i);
        }

        return Math.max( (max1 - min1),  (max2 - min2) );
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}