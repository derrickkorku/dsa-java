import java.math.*;

class Anagram {

    public final static int NUMBER_LETTERS = 26;

    public static int anagranNum(String s1, String s2) {
        int[] s1Counts = getArrCounts(s1);
        int[] s2Counts = getArrCounts(s2);

        return getDelta(s1Counts, s2Counts);
    }

    public static int getDelta(int[] s1arr, int[] s2arr) {

        if (s1arr.length != s2arr.length) {
            return -1;
        }

        int delta = 0;

        for (int i = 0; i < s1arr.length; i++) {
            int dif = Math.abs(s1arr[i] - s2arr[i]);
            delta += dif;
        }

        return delta;
    }

    public static int[] getArrCounts(String st) {
        int[] charCounts = new int[NUMBER_LETTERS];

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            int offset = (int) 'a';
            int code = c - offset;

            charCounts[code]++;
        }

        return charCounts;
    }

    public static void main(String[] args) {
        String st1 = "hello";
        String st2 = "billion";

        System.out.println(anagranNum(st1, st2));
    }
}