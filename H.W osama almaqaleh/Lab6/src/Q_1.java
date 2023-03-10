public class Q_1 {
    public Node getMiddleNode(Node head, Node tail) {
        Node slow = head.next;
        Node fast = head.next;

        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
