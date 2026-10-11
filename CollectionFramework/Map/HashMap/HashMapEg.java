package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {
    public static void main(String args[]) {

        HashMap m1 = new HashMap<>();
        m1.put(101, "Rishika");
        m1.put("102", "Anamika");
        m1.put(true, "Rama");
        m1.put(null, null);
        m1.put(103, 100);
        System.out.println(m1);// {null=null, 102=Anamika, 101=Rishika, 103=100, true=Rama}
    }
}
