package Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetEg {
    public static void main(String args[]) {

        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add("hello");
        lhs.add(true);
        lhs.add(20.41);

        System.out.println(lhs);// [10, hello, true, 20.41]
    }
}
