package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ReversePolish {

    public ArrayList<String> convert(String[] expression) {
        // Converts an expression to reverse polish notation
        ArrayList<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        String[] operators = {"*", "/", "-", "+"};
        for (String token : expression) {
            if (!Arrays.asList(operators).contains(token)) {
                result.add(token);
            }
            else {
                while (!stack.isEmpty() && getPriority(stack.peek()) >= getPriority(token)) {
                    result.add(stack.pop());
                }
                stack.push(token);
            }
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }

    public double compute(String[] tokens) throws MismatchedOperatorsException {
        // Computes an expression in reverse polish notation
        String[] operators = {"*", "/", "-", "+"};
        Stack<String> stack = new Stack<String>();
        double x, y;
        String result = "";
        int get = 0;
        String choice;
        double value = 0.0;
        String p = "";
        for (String token : tokens) {
            if (!Arrays.asList(operators).contains(token)) {
                stack.push(token);
                continue;
            } else {
                choice = token;
            }
            switch (choice) {
                case "+":
                    x = Double.parseDouble(stack.pop());
                    y = Double.parseDouble(stack.pop());
                    value = x + y;
                    result = p + value;
                    stack.push(result);
                    break;
                case "-":
                    x = Double.parseDouble(stack.pop());
                    y = Double.parseDouble(stack.pop());
                    value = y - x;
                    result = p + value;
                    stack.push(result);
                    break;
                case "*":
                    x = Double.parseDouble(stack.pop());
                    y = Double.parseDouble(stack.pop());
                    value = x * y;
                    result = p + value;
                    stack.push(result);
                    break;
                case "/":
                    x = Double.parseDouble(stack.pop());
                    y = Double.parseDouble(stack.pop());
                    value = y / x;
                    result = p + value;
                    stack.push(result);
                    break;

                default:
            }
        }
        if(stack.size() > 2) throw new MismatchedOperatorsException("Not enough operators for the operands");
        return Double.parseDouble(stack.pop());
    }

    private int getPriority(String operator) {
        //returns mathematical priority based on PEMDAS
        if(operator.equals("*") || operator.equals("/")) {
            return 0;
        }
        else if (operator.equals("+") || operator.equals("-")) {
            return 1;
        }
        else {
            return 2;
        }
    }
}