import java.util.Arrays;

public class LongestStringProblems {

    /**
     * Finding the longest substring at the beginning of two strings
     */

    public static String longestSubstring(String s, String t) {
        int N = Math.min(s.length(), t.length());

        for (int i = 0; i < N; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return s.substring(0, i);
            }
        }

        return s.substring(0, N);
    }

    /**
     * Finding longest repeated sub sequence in a string
     */
    public static String lognestRepeatedSubSequence(String s) {
        int N = s.length();
        String lrs = "";

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                String x = longestSubstring(s.substring(i, N), s.substring(j, N));
                if (x.length() > lrs.length()) {
                    lrs = x;
                }
            }
        }

        return lrs;
    }

    /**
     * Improved solution using array suffixes
     */
    public static String longestRepeatedSubSequenceImproved(String s) {
        int N = s.length();

        String[] suffixes = new String[N];

        for (int i = 0; i < N; i++) {
            suffixes[i] = s.substring(i, N);
        }

        Arrays.sort(suffixes);

        String lrs = "";

        for (int i = 0; i < N - 1; i++) {
            String x = longestSubstring(suffixes[i], suffixes[i + 1]);
            if (x.length() > lrs.length()) {
                lrs = x;
            }
        }

        return lrs;
    }
}
