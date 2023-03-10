public class Q_5 {
public static Node[] splitCircularList(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast.next != head && fast.next.next != head) {
        slow = slow.next;
        fast = fast.next.next;
    }
    Node middle = slow.next;
    slow.next = null;
    Node secondHead = middle;
    while (middle.next != head) {
        middle = middle.next;
    }
    middle.next = secondHead;
    Node[] result = new Node[2];
    result[0] = head;
    result[1] = secondHead;
    return result;
    }

}
