public class Q_4 {
    public static boolean sameSequence(Node l, Node m) {
    if (l == null || m == null) {
        return l == m;
    }

    Node currL = l;

    do {
        Node currM = m;

        while (currL != null && currM != null && currL.data == currM.data) {
            currL = currL.next;
            currM = currM.next;

            if (currL == l) {
                return true;
            }
        }
        currL = currL.next;
    } while (currL != l);

    return false;
}

}
