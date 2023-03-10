public class SizeMethod <E> {

        E head;
        E next;
private static class Node<E>{
    E next;
    E element;

    public Node() {
    }

    public E getNext() {
        return next;
    }
    public void setNext(E next) {
        this.next = next;
    }
    public E getElement() {
        return element;
    }
    public void setElement(E element) {
        this.element = element;
    }
}
    public int size() {
        Node<E> tmp = (Node<E>) head;
        int size = 0;
        if (head == null) {
            return size;
        }
    else {
        size++;
        while (tmp.next != null) {
            tmp = (Node<E>) tmp.next;
            size++;
            }
        }
    return size;
}

}
