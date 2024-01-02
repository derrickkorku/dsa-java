public class PasswordComplex {
    public static boolean isPasswordComplex(String s) {
        if (s.length() < 6) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (char c : s.toCharArray()) {
            if (hasDigit && hasUpperCase && hasLowerCase) {
                return true;
            }

            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }

        return false;
    }

    public static boolean isPasswordComplex2(String password) {
        return password.length() >= 6 && password.matches("*\\d*") && password.matches("*[a-z]*")
                && password.matches("*[A-Z]*");
    }
}
