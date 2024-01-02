import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShortestPalindrome {
    public static String shortestPalindrome(String s){
        List<Character> result = new ArrayList<>();

        for (Character c : s.toCharArray()){
            result.add(c);
        }

        int len = result.size();

        for (int i = 0; i < len - 1; i++){
            if (result.get(i) != result.get(len - 1 - i)) {
                result.add(i, result.get(len - 1 - i));
                i = 0;
                len = result.size();
            }
        }

        return result.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(shortestPalindrome("bubble"));
    }
}
