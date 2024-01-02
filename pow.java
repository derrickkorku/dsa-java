class Pow { 
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }

    public static int pow(int num1, int num2) {
        if (num2 == 0){
            return 1;
        }

        return num1 * pow(num1, num2 - 1);
    }
}