import java.util.Arrays;
import java.util.Objects;

public class SecondSmallestNumberInArray {
    public static Integer findSecondSmallest(Integer[] arr){
        if (arr == null || arr.length == 0) {
            return null;
        }

        Arrays.sort(arr);

        for (int i = 0 ; i < arr.length - 1; i++){
            if (!Objects.equals(arr[i], arr[i + 1])){
                return arr[i + 1];
            }
        }

        return null;
    }
}
