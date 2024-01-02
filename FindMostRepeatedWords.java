import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class FindMostRepeatedWords {
    public static String find(String input) {
        List<String> uncommonWords = uncommonWords(input);

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : uncommonWords) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        int max = 0;
        String word = "";
        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                word = key;
            }
        }

        return word;
    }

    public static List<String> uncommonWords(String input){
        String normalized = input.toLowerCase().trim();
        String[] words = normalized.split("[{ \\t\\n\\r\\.(),:}]");

        List commonWords = List.of("the", "a", "or", "an", "it", "and",
                "but", "is", "are", "of", "on", "to", "was", "were", "in",
                "that", "i", "your", "his", "their", "her", "you", "me",
                "they", "at", "be");
        
        return Arrays.stream(words).filter(word => !commonWords.contains(word) && word.length() =! 0).collect(Collectors.toList());
    }
}