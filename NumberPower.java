class NumberPower {
    public static void main(String[] args){
        int[] mem = new int[4];
        System.out.println("---------- " + numPow(2, 3, mem));
    }

    public static int numPow(int a, int b, int[] mem) {
        if (b < 0) {
            return 0;
        } else if (b == 0){
            return 1;
        }  else if (mem[b] > 0) {
            return mem[b];
        }
        else {
            return mem[b] =  a * numPow(a, b - 1, mem);
        }
    }
}