import java.util.Arrays;

public class Main {

    public static String sort(int[] A, int end){
       int s = 0, m = 0, p = 1;

       while (m <= end){
           if (A[m] < p){
               swap(A, s, m);
               ++m;
               ++s;
           } else if (A[m] > p){
               swap(A, m, end);
               --end;
           } else {
               ++m;
           }
       }

       return Arrays.toString(A);
    }

    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void main(String[] args) {
        System.out.println(sort(new int[] { 2, 0, 0, 1, 1, 0, 2, 2 }, 7));
    }
}