/**
 * Find the binary of a number using recursive function
 */
public class FindBinaryOfNumber {
    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.println(value % 2);
        }
    }
}
