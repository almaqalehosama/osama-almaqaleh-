public class Q_3 {
    public boolean equals(Object o) {
    if (o == this) {
        return true;
    }
    if (!(o instanceof DoublyLinkedList)) {
        return false;
    }
    DoublyLinkedList other = (DoublyLinkedList) o;
    if (size() != other.size()) {
        return false;
    }
    Iterator<E> it1 = iterator();
    Iterator<E> it2 = other.iterator();
    while (it1.hasNext()) {
        E e1 = it1.next();
        E e2 = it2.next();
        if (e1 == null ? e2 != null : !e1.equals(e2)) {
            return false;
        }
    }
    return true;
}

}
