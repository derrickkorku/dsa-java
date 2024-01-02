class DetectCapitalUse {
    public static void detect(String word) {
        int numOfCaps = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                ++numOfCaps;
            }
        }
    }
}