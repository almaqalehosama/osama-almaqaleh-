public class Q_4 {
    public static <DoublyLinkedList> DoublyLinkedList concatenate(DoublyLinkedList L, DoublyLinkedList M) {
    DoublyLinkedList L = new DoublyLinkedList();
    if (L.isEmpty() && M.isEmpty()) {
        return L′;
    } else if (L.isEmpty()) {
        L′ = M.copy();
        return L′;
    } else if (M.isEmpty()) {
        L′ = L.copy();
        return L′;
    } else {
        L′.setHeader(L.getHeader());
        L′.setTrailer(M.getTrailer());
        L.getTrailer().setNext(M.getHeader());
        M.getHeader().setPrev(L.getTrailer());
        return L′;
    }
}

}
