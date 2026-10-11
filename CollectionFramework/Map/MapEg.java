package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEg {
    public static void main(String args[]) {

        Map m1 = new HashMap<>();
        m1.put(101, "Rishika");
        m1.put("102", "Anamika");
        m1.put(true, "Rama");
        m1.put(null, null);
        m1.put(103, 100);
        // System.out.println(m1);//{null=null, 102=Anamika, 101=Rishika, 103=100,
        // true=Rama}

        // duplicate key
        m1.put(103, 527);
        // System.out.println(m1);//{null=null, 102=Anamika, 101=Rishika, 103=527,
        // true=Rama}

        // dupplicate value
        m1.put(104, "Rama");
        // System.out.println(m1);//{null=null, 102=Anamika, 101=Rishika, 103=527,
        // 104=Rama, true=Rama}

        // duplicate null-key
        m1.put(null, "hi");
        // System.out.println(m1);//{null=hi, 102=Anamika, 101=Rishika, 103=527,
        // 104=Rama, true=Rama}

        // duplicate null-value
        m1.put(11, null);
        // System.out.println(m1);//{null=hi, 102=Anamika, 101=Rishika, 103=527,
        // 104=Rama, 11=null, true=Rama}

        Set keyVal = m1.keySet();
        // System.out.println(keyVal);//[null, 102, 101, 103, 104, 11, true]

        // Set setVal = (Set)m1.values();
        Collection setVal = m1.values();
        // System.out.println(setVal);//[hi, Anamika, Rishika, 527, Rama, null, Rama]

        // System.out.println(m1.entrySet());//[null=hi, 102=Anamika, 101=Rishika,
        // 103=527, 104=Rama, 11=null, true=Rama]
    }
}
