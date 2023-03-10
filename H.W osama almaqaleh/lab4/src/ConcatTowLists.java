import java.util.LinkedList;

public class ConcatTowLists {
    private static class Node<E>{
    E next;
    E element;
        public Node() {}
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
    LinkedList l1=new LinkedList<>();
    LinkedList l2=new LinkedList<>();
    LinkedList m=new LinkedList<>();
    Node node =new Node<>()

    LinkedList node = (LinkedList) l1.getFirst();

    while(l1.getNext() != null ) {
        node = (Node) node.getNext();
    }
    node.setNext( M.head.getNext());

    l1.size =l1.size +l2.size;

    return m;




}
