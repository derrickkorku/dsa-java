class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++){
             result = str.charAt(i) + result;
        }

        return result;
    }

    public static String reverse2(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }
}