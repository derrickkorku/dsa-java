public class Main {
    public static String removeSpaces(String s){
        if (s == null || s.isEmpty()){
            return s;
        }

        int writeIndex = 0;
        int readIndex = 0;
        char[] chars = s.toCharArray();

        while (readIndex < chars.length){
            if (chars[readIndex] != ' '){
                chars[writeIndex] = chars[readIndex];
                writeIndex++;
            }
            readIndex++;
        }

        return new String(chars, 0, writeIndex);
    }

    public static void main(String[] args) {
        String inputStr = "Hello, World! This is a test.";
        String outputStr = removeSpaces(inputStr);
        System.out.println(outputStr); // Output: "Hello,World!Thisisatest."
    }
}