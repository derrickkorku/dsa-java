public class PairExists {
    public static boolean pairExists(int[] arr, int x){
        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            int sum = arr[i] + arr[j];
            if (sum == x) {
                return true;
            } else if (sum < x) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }
}
