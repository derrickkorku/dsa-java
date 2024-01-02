/**
 * Java algorithm to find out if two strings are one edit away
 */
public class OneEditAway {
    public static boolean isOneEditAway(String s1, String s2){
        if (Math.abs(s1.length() - s2.length()) > 1) return false;

        if (s1.length() - s2.length() == 0) {
            return onEditReplace(s1, s2);
        } else {
            return onEditInsert(s1, s2);
        }
    }

    public static boolean onEditReplace(String s1, String s2){
        boolean found = false;

        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                if (found){
                    return false;
                }
                found = true;
            }
        }

        return true;
    }

    public static boolean onEditInsert(String s1, String s2){
        String str1 = s1.length() > s2.length() ? s1 : s2;
        String str2 = s1.length() < s2.length() ? s1 : s2;

        int i1 = 0;
        int i2 = 0;

        while(i1 < str1.length() && i2 < str2.length()){
            if (str1.charAt(i2) != str2.charAt(i2)){
                 if (i1 != i2){
                     return false;
                 }
                i2++;
            }else {
                i1++;
                i2++;
            }
        }

        return true;
    }
}
