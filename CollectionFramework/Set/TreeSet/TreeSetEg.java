package Set.TreeSet;

import java.util.TreeSet;

public class TreeSetEg {
    public static void main(String args[]) {

        TreeSet ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(3);
        ts.add(25);
        ts.add(12);

        System.out.println(ts);// [3, 10, 12, 20, 25]
    }
}
