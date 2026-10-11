package Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorEg {
    public static void main(String[] args) {

        Vector vc = new Vector<>();
        vc.add(5);
        vc.add(9);
        vc.add(27);

        // System.out.println(vc);//[5, 9, 27]

        Enumeration en = vc.elements();
        // System.out.println(en);//java.util.Vector$1@7344699f
        // System.out.println(en.hasMoreElements());//true

        while (en.hasMoreElements()) {
            // System.out.println(en.nextElement());//5 9 27 (in vertical)
            Integer val = (Integer) en.nextElement();
            // System.out.println(val);//5 9 27 (in vertical) same output

        }
    }
}
