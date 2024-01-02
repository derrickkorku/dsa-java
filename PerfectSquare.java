public class PerfectSquare {
    public static boolean isPerfectSquare(int number){
        if (number < 0) return false;

        return isPerfectSquareHelper(number, 0, number);
    }
    
    public static boolean isPerfectSquareHelper(int number, int start, int end){
        if (start > end) return false;

        int mid = start + (end - start) / 2;
        long square = mid * mid;

        if (square == number){
            return true;
        } else if(square > number) {
            return isPerfectSquareHelper(number, start, mid - 1);
        } else {
            return isPerfectSquareHelper(number, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int number = 24;
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}
