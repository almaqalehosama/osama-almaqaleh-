// Implement a method with signature transfer(S, T) that transfers
// all elements from stack S onto stack T, so that the element
// that starts at the top of S is the first to be inserted onto T,
// and the element at the bottom of S ends up at the top of T.
import java.util.Stack;
public class StackTransfer {
public static void transfer(Stack<Integer> S, Stack<Integer> T) {
    while (!S.isEmpty()) {
        T.push(S.pop());
        }
    }
public static void main(String[] args) {
    Stack<Integer> S = new Stack<>();
    Stack<Integer> T = new Stack<>();

    S.push(1);
    S.push(2);
    S.push(3);

    transfer(S, T);

    while (!T.isEmpty()) {
        System.out.println(T.pop());
    }
}
}
