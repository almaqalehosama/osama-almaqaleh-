import java.util.Scanner;
import java.util.Stack;

public class PostfixExpressionEvaluator {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter postfix expression: ");
    String expression = scanner.nextLine();
    scanner.close();

    double result = evaluatePostfixExpression(expression);
    System.out.println("Result: " + result);
    }

    private static double evaluatePostfixExpression(String expression) {
        Stack<Double> stack = new Stack<>();

    for (int i = 0; i < expression.length(); i++) {
        char c = expression.charAt(i);
        if (Character.isDigit(c)) {
            stack.push((double) (c - '0'));
        } else if (c == '+' || c == '-' || c == '*' || c == '/') {
            double operand2 = stack.pop();
            double operand1 = stack.pop();
            double result = 0;
            switch (c) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
            }
            stack.push(result);
        }
    }

        return stack.pop();
}
}
