import org.w3c.dom.Node;

public class SizeMethod {public int size() {
    Node tail = null;
    if (tail == null) {
        return 0;
    }
    int count = 1;
    Node current = tail.getNext();
    while (current != tail) {
        count++;
        current = current.getNext();
    }
    return count;
}

}
