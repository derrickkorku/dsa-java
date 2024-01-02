import java.util.HashMap;
import java.util.Set;

/**
 * An anagram of a string is 2 strings with the same characters but different
 * order of the characters
 */
class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            } else {
                map.put(str1.charAt(i), 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) - 1);
            } else {
                return false;
            }
        }

        Set<Character> keys = map.keySet();

        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }

        return true;
    }
}