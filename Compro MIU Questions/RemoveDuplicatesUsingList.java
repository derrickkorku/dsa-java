import java.util.*;

class RemoveDuplicatesUsingList {

    public static void removeDuplicates(List<Integer> list) {
        int i, j;

        for (i = 0; i < list.size(); i++) {
            for (j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }

        System.out.println(list);
    }
}