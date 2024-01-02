class VowelsConsonantsCount {
    public void count(String str) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        String vowels = "aeiouy";
        String normalized = str.toLowerCase().trim();
        char[] normalizedArr = normalized.toCharArray();

        for (char c : normalizedArr) {
            if (vowels.indexOf(c) != -1) {
                vowelsCount++;
            } else if (c != ' ') {
                consonantsCount++;
            }
        }
    }
}