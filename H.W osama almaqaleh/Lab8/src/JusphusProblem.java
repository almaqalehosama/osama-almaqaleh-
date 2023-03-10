
    import java.util.LinkedList;
import java.util.Queue;

class JosephusProblem {

    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        int survivor = josephus(n, k);
        System.out.println("Survivor: " + survivor);
    }

    private static int josephus(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                int removed = queue.remove();
                queue.add(removed);
            }
            queue.remove();
        }
        return queue.remove();
    }
    }


