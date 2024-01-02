/**
 * Find the sum of all digits in an integer
 */
class SumIntDigits {
  public static int sumIntDigits(int num) {
    int sum = 0;

    while(num > 0) {
        result = result + num % 10;
        num = num / 10;
    }
  }
}