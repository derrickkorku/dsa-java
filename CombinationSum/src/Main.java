import java.util.*;

public class Main {
    public static List<List<Integer>> findCombinationSum(int[] arr, int x){
        Set<Integer> set = new HashSet<>();

        List<Integer> list = new ArrayList<>();

        for (int num : arr){
            set.add(num);
        }

        list.addAll(set);
        Collections.sort(list);


    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}