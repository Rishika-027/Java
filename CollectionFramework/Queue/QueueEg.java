package Queue;

import java.util.PriorityQueue;

public class QueueEg {
    public static void main(String args[]) {

        PriorityQueue pq = new PriorityQueue<>();

        // inserting a value
        pq.offer(30);
        pq.offer(27);
        pq.offer(10);
        pq.offer(29);
        pq.offer(20);
        System.out.println(pq);// [10, 20, 27, 30, 29]
        pq.offer(null);
        System.out.println(pq);// NullPointerException

        // removing a value
        pq.poll();
        System.out.println(pq);// [20, 29, 27, 30]
        System.out.println(pq.peek());// 20
    }
}
