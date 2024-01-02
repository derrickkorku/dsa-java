import java.util.*;
import java.util.stream.Collectors;

public class MergeIntervals {
    public static List<List<Integer>> mergeIntervals(int[][] ranges){
       Arrays.sort(ranges, (int[] a, int[] b) -> {
           return a[0] - b[0] != 0 ? a[0] - b[0] : a[1] - b[1];
        });

       List<List<Integer>> result = new ArrayList<List<Integer>>();
       List<Integer> last = null;

       for (int[] arr : ranges){
           if (last == null || arr[0] > last.get(1)){
               last = Arrays.stream(arr).boxed().collect(Collectors.toList());
               result.add(last);
           } else if (arr [0] < last.get(1)){
               last.set(1, arr[1]);
           }
       }

       return result;
    }
}
