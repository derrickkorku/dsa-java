class ReverseInt {
    public static int reserveInt(int num) {

        if (num == 0 || num == 1)
            return num;

        int sign = 1;
        int reverse = 0;

        if (num < 0) {
            num = -num;
            sign = -1;
        }

        while (num != 0) {
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }

        return sign + reverse;
    }

    public static void main() {

    }
}