class JoinstringBest {
    public static String joinStrings(String[] words){
        StringBuilder sentence = new StringBuilder();
        for(String word : words){
            sentence.append(word);
        }

        return sentence.toString();
    }
}