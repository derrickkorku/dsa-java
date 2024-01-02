/**
 * Write a Recursive Solution to Check if a Given Number is a Prime Number or Not.
 *
 * Given a positive integer, we need to determine whether it is a prime number or not. A prime number is a number greater than 1 that has no positive divisors other than 1 and the number itself.
 */
public class PrimeNumber {
    public static boolean isPrime(int number){
        if (number <= 1) return false;

        return isPrimeHelper(number, 2);
    }

    public static boolean isPrimeHelper(int number, int divisor){
        if (divisor > Math.sqrt(number)) return true;

        if (number % divisor == 0) return false;
        return isPrimeHelper(number, divisor + 1);
    }

    public static void main(String[] args) {
        System.out.println("True | False: " + isPrime(8));
    }
}
