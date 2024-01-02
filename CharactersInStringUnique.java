public class CharactersInStringUnique {
    public static boolean isUniqueCharactersString(String str){
        if (str.length() > 128) {
            return false;
        }

        boolean[] arr = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (arr[val]) {
                return false;
            }

            arr[val] = true;
        }

        return true;
    }
}
