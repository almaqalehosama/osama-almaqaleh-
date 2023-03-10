import java.util.Arrays;
public class ArrayStack<T> implements Cloneable {
    private T[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }


        @Override
    public ArrayStack<T> clone() {
    try {
        ArrayStack<T> cloned = (ArrayStack<T>) super.clone();
        cloned.elements = Arrays.copyOf(elements, size);
        return cloned;
    } catch (CloneNotSupportedException e) {
        throw new AssertionError();
    }
    }
}



