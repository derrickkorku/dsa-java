public class PowerRecursive {
    public static int powerRecursive(int x, int n ){
        if (n <= 0) {
            return 1;
        }

        return x * powerRecursive(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(powerRecursive(2, 5));
    }
}
