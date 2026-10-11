package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEg {
    public static void main(String[] args) {

        Deque dq = new ArrayDeque<>();
        dq.add(5);
        dq.add(9);
        dq.add(27);
        dq.add(true);
        dq.add("hi");
        System.out.println(dq);// [5, 9, 27, true, hi]

        // addFirst()
        dq.addFirst(0);
        dq.addLast(2);
        System.out.println(dq);// [0, 5, 9, 27, true, hi, 2]
    }
}
