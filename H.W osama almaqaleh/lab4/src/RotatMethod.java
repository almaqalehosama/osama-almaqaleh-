public class RotatMethod {
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
    Node  head;
    public void rotate(){
        if (head==null || head.next==null){
            return;
        }
        Node last=head;
        while (last.next !=null){
            last= (Node) last.next;
        }
        last.next=head;
        head= (Node) head.next;
       ((Node<?>) last.next).next=null;
    }
}
