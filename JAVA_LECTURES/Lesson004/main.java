import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        int item = queue.remove();
        queue.offer(2809);
        item = queue.poll();
        System.out.println(queue);
    }
}
