import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Palindrome {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER. The function accepts STRING s
     * as parameter.
     */

    public static int palindromeIndex(String s) {

        int strlen = s.length();

        System.out.println(strlen);

        int palIndex = -1;

        for (int i = 0; i < strlen / 2; i++) {
            if (s.charAt(i) != s.charAt(strlen - 1 - i)) {
                  
                System.out.print(s.substring(i + 1, s.length() - i));

                boolean ans = isValidPal(s.substring(i + 1, s.length() - i));

                if (ans) {
                    return i;
                } else {
                    return strlen - 1 - i;
                }

            }
        }

        return palIndex;

    }

    private static boolean isValidPal(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String text = "aaab";
        int an = palindromeIndex(text);

        System.out.println(an);
    }

}
