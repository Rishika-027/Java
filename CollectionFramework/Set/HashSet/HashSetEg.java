package Set.HashSet;

import java.util.HashSet;

public class HashSetEg {
    public static void main(String arg[]) {

        HashSet hs = new HashSet();
        hs.add(10);
        hs.add("hello");
        hs.add(true);
        hs.add(null);
        hs.add(10.242);
        hs.add(null);
        System.out.println(hs);// [null, 10, hello, 10.242, true]

        hs.remove(null);
        System.out.println(hs);// [10, hello, 10.242, true]

        hs.remove(true);
        System.out.println(hs);// [10, hello, 10.242]

        hs.remove(10);
        System.out.println(hs);// [hello, 10.242]

        hs.remove("hello");
        System.out.println(hs);// [10.242]
    }
}
