package Cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEg {
    public static void main(String args[]) {

        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(15);
        al.add(33);
        al.add(24);
        al.add(35);
        al.add(12);
        System.out.println(al);// [10, 15, 33, 24, 35, 12]

        Iterator it = al.iterator();
        // System.out.println(it);//java.util.ArrayList$Itr@1dbd16a6
        // System.out.println(it.hasNext());

        while (it.hasNext()) {
            // System.out.println(it.next());
            Integer val = (Integer) it.next();
            // System.out.println(val);

            if (val % 2 == 0) {
                System.out.println(val);// 10, 24, 12 (in vertical)
            } else {
                it.remove();
            }
        }
        System.out.println(al);// [10, 24, 12]

    }
}
