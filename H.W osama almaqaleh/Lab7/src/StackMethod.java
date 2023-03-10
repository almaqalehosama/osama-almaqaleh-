import java.util.Stack;

public class StackMethod {
    Stack<Integer>Osama= new Stack<>();
public static void removeAllElements(Stack<Integer> stack) {
    if (!stack.isEmpty()) {
        stack.pop();
        removeAllElements(stack);
    }

}
}

