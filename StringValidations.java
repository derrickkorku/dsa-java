/**
 * Validation algorithms for Strings
 */
class StringValidations {
    public static boolean isUpperCase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String s) {
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static boolean isPasswordComplex(String s) {
        return s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isDigit);
    }
}