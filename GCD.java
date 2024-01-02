/**
 * Write recursive code to calculate the Greatest Common Divisor (GCD) of Two Positive Numbers.
 *
 * The greatest common divisor (GCD) of two positive integers A and B is the largest positive integer that divides both A and B without leaving a remainder.
 */
public class GCD {
    private static int calculateGCD(int a, int b){
        if (b == 0) {
            return a;
        }

        return calculateGCD(b, a % b);
    }
    public static void main(String[] args) {
        System.out.println(calculateGCD(10, 15));
    }
}
