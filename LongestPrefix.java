class LongestPrefix {

    public static String findLongestPrefix(String s, String t) {
        int N = Math.min(s.length(), t.length());

        for (int i = 0; i < N; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return s.substring(0, i);
            }
        }

        return s.substring(0, N);
    }

    public static String findLongestString(String s) {
        String longestString = "";
        int N = s.length();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                String x = findLongestPrefix(s.substring(i, N), s.substring(j, N));
                if (x.length() > longestString.length())
                    longestString = x;
            }
        }

        return longestString;
    }

    public static void main(String[] args) {

    }
}