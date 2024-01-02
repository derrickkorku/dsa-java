/**
 * Java Algorithm to find if a string is a permutation of another
 */

public class StringsPermutation {
    public static boolean isPermutation(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        return sortString(str1).equals(sortString(str2));
    }


    public static boolean isPermutationImproved(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int lengths[] = new int[128];

        char[] chars = str1.toCharArray();

        for(char c: chars){
            lengths[c]++;
        }

        for (int i=0; i < str2.length(); i++){
            int c = str2.charAt(i);
            lengths[c]--;

            if (lengths[c] != 0){
                return false;
            }
        }

        return true;
    }

    private static String sortString(String str){
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
}
