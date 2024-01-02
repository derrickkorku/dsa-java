/**
 * Write a Recursive Procedure to Convert a Decimal Number to a Binary Equivalent.
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        decimalToBinary(10);
    }
    public static void  decimalToBinary(int N){
        if (N > 0){
            decimalToBinary(N / 2);
            System.out.println(N % 2);
        }
    }
}
