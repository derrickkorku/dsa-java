import java.util.*;

class RemoveDuplicatesFromArray {
    public static void main(String[] args) {

    }

    public static void removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.print(set);
    }

    public static void removeDuplicatesTwo(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.get(arr[i])) {
                System.out.print(i + ' ');
                map.put(arr[i], true);
            }
        }
    }
}