package Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DocumentSearch {
    public static int shortesInterval(String[] document, String[] query) {
        /**
         * Create a Hashmap to store the position of each query word in the docuument
         */

        HashMap<String, List<Integer>> positions = new HashMap<>();

        for (String word : query) {
            positions.put(word, new ArrayList<Integer>());
        }

        for (int i = 0; i < document.length; i++) {
            String word = document[i];

            if (positions.containsKey(word)) {
                positions.get(word).add(i);
            }
        }

        return 0;
    }
}
