public class Q_2 {
public <CircularlyLinkedList> boolean equals(Object other) {
    if (this == other) {
        return true;
    }
    if (other == null || getClass() != other.getClass()) {
        return false;
    }
    CircularlyLinkedList<?> that = (CircularlyLinkedList<?>) other;
    if (size != that.size) {
        return false;
    }
    Node<?> thisNode = head;
    Node<?> thatNode = that.head;
    for (int i = 0; i < size; i++) {
        if (!thisNode.getElement().equals(thatNode.getElement())) {
            return false;
        }
        thisNode = thisNode.getNext();
        thatNode = thatNode.getNext();
    }
    return true;
    }

}
