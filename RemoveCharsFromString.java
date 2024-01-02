/**
 * Remove characters from a string using recursive function
 */
public class RemoveCharsFromString {
    public static String removeCharacter(String str, char x) {
        if (str.length() == 0) {
            return "";
        }

        if (str.charAt(0) == x) {
            return removeCharacter(str.substring(1), x);
        } else {
            return str.charAt(0) + removeCharacter(str.substring(1), x);
        }
    }
}
