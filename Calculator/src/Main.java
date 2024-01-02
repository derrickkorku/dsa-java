import java.util.Stack;

public class Main {
    public static int calculate(String str){
        if (str == null || str.isEmpty()) return 0;

        Stack<Integer> digits = new Stack<>();
        Stack<Integer> op = new Stack<>();
        int result = 0;
        int sign = 1;

        for (int i = 0; i < str.length(); i++){
            char cur = str.charAt(i);

            if (cur == ' '){
                continue;
            } else if (cur == '+') {
                sign = 1;
            } else if (cur == '-') {
                sign = -1;
            } else if ('0' <= cur && cur <= '9') {
                StringBuilder num = new StringBuilder(Character.toString(cur));

                while ((i + 1) < str.length() && str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9'){
                    num.append(str.charAt(i + 1));
                    i++;
                }

                result += (sign * Integer.parseInt(num.toString()));
            } else if (cur == '(') {
                digits.push(result);
                result = 0;
                op.push(sign);
                sign = 1;
            } else if (cur == ')') {
                result = op.pop() * result + digits.pop();
                sign = 1;
            }
        }

        return result;
    }

    public static int calculateMultiplication(String str){
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        char sign = '+';

        str += "+";

        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                num = num * 10 + str.charAt(i) - '0';
            }

            char cur = str.charAt(i);
            if ( "+-/*".indexOf(cur) != -1 || i == str.length() - 1 ){
                if (sign == '+'){
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }

                if (cur == ')'){
                    num = 0;
                    int item = stack.pop();

                    while (item != Integer.MAX_VALUE){
                        num += item;
                        item = stack.pop();
                    }

                    sign = (char) stack.pop().intValue();
                }else {
                    sign = cur;
                    num = 0;
                }
            }

            if (cur == '('){
                stack.push((int)sign);
                stack.push(Integer.MAX_VALUE);
                sign = '+';
            }
        }

        return stack.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        System.out.println(calculate("2 + 2"));
        System.out.println(calculate("(2+2) - 3"));
    }
}