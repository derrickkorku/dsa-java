import java.util.Stack;

public class StackWithMaxValue {
    private Stack<Double> stack = new Stack<Double>();
    private Stack<Double> maxStack = new Stack<Double>();

    public void push(Double item) {
        stack.push(item);

        if (maxStack.empty() || item > maxStack.peek()) {
            maxStack.push(item);
        }
    }

    public Double pop() {
        if (!stack.empty()) {
            Double item = stack.pop();
            if (item == maxStack.peek()) {
                maxStack.pop();
            }

            return item;
        }

        return null;
    }

    public Double getMax() {
        return maxStack.peek();
    }
}
