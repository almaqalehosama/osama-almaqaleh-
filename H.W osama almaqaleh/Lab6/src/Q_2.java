import static jdk.internal.logger.BootstrapLogger.BootstrapExecutors.head;

public class Q_2 {
    public int size() {
    int count = 0;
    Node current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
    }

}
