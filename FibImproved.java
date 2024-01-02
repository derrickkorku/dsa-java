public class FibImproved {
    public static void main(String[] args) {
        int[] mem = new int[6];
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " : " + findFib(i, mem));
        }
    }

    public static int findFib(int n, int[] mem){
        if (n == 0 || n == 1) return n;

        if (mem[n] > 0) {
            return mem[n];
        }

        return mem[n] = findFib(n - 1, mem) + findFib(n - 2, mem);
    }


    public static int findFibTwo(int n){
        if (n == 0 || n == 1) return n;

        int[] mem = new int[n + 1];

        mem[0] = 0;
        mem[1] = 1;

        for (int i = 2; i < n; i++){
            mem[i] = mem[i - 1] + mem[i - 2];
        }

        return mem[n - 1] + mem[n - 2];
    }
}
