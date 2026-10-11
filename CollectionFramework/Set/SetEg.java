package Set;

import java.util.HashSet;
import java.util.Set;

// public class SetEg {
//     public static void main(String args[]){

//         Set s1 = new HashSet<>();
//         s1.add(10);
//         s1.add("hello");
//         s1.add("abcd");
//         s1.add(null);
//         s1.add(null);
//         s1.add(10);
//         System.out.println(s1);
//     }
// }

public class SetEg {

    public static void main(String args[]) {

        EmpEg emp1 = new EmpEg(101, "Rishika", 10000);
        EmpEg emp2 = new EmpEg(102, "Spandana", 20000);
        EmpEg emp3 = new EmpEg(103, "Likhitha", 100000);

        Set s1 = new HashSet<>();
        s1.add(emp1);
        s1.add(emp2);
        s1.add(emp3);
        System.out.println(s1);
    }
}
