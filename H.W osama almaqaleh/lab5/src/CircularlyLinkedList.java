import org.w3c.dom.Node;

public class CircularlyLinkedList<E> implements Cloneable {
        private int size;
        private Node tail;

        public CircularlyLinkedList() {
            size = 0;
            tail = null;
        }
        @Override
public CircularlyLinkedList<E> clone() {
    try {
        CircularlyLinkedList<E> cloned = (CircularlyLinkedList<E>) super.clone();
        if (size > 0) {
            cloned.tail = new Node(tail.getElement(), null);
            Node<E> original = tail.getNext();
            Node<E> clonedCurrent = cloned.tail;
            while (original != tail) {
                Node<E> clonedNext = new Node<>(original.getElement(), null);
                clonedCurrent.setNext(clonedNext);
                clonedCurrent = clonedNext;
                original = original.getNext();
                }
                clonedCurrent.setNext(cloned.tail);
            }
            return cloned;
        }
    catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

 
