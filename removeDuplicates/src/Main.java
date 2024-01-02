import java.util.Arrays;

public class Main {
    public static void removeDuplicates(int[] nums){
        int j = 1;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(j);
    }
    public static void main(String[] args) {
        removeDuplicates(new int[] {1, 1, 2});
    }
}