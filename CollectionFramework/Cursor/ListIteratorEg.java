package Cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEg {
    public static void main(String[] args) {

        List ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        // System.out.println(ls);//[10, 20, 30, 40]
        // System.out.println(ls.add(52));//true (that means the value 527 is added
        // successfully to the collection)
        // System.out.println(ls.add(59));//true
        // System.out.println(ls);//[10, 20, 30, 40, 52, 59]

        ListIterator lt = ls.listIterator(ls.size());
        // System.out.println(lt);//java.util.ArrayList$ListItr@7ad041f3
        // System.out.println(lt.hasNext());//true
        // System.out.println(lt.hasPrevious());//false (bcoz, intially it checks the
        // 1st element i.e 10 for hasNext()- it is "True" and for hasPrevious()- it is
        // "False" as there is no another element before 10)

        // while (lt.hasNext()) {
        // Integer val = (Integer)lt.next();
        // // System.out.println(val);//10, 20, 30, 40 (in vertical)

        // if(val.equals(10)){
        // lt.remove();
        // }
        // else if(val.equals(20)){
        // lt.add("Rishika");
        // }
        // else if(val.equals(40)){
        // lt.set("lets Nacho");
        // }
        // }
        // System.out.println(ls);

        ArrayList reverseList = new ArrayList<>();

        while (lt.hasPrevious()) {
            // System.out.println("Previous elements: " + reverseList.add(lt.previous()));//
            // true true true true (for 10-40)
            Integer elem = (Integer) lt.previous();
            System.out.println(elem);// 40, 30, 20, 10 (in vertical)
            reverseList.add(elem);
        }
        System.out.println(reverseList);// [40,30,20,10]

    }
}
