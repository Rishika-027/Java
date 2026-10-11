package Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapEg {

    public static void main(String args[]) {

        LinkedHashMap lm = new LinkedHashMap<>();
        lm.put(101, "Rama");
        lm.put(102, "Sita");
        lm.put(103, "Krishna");
        lm.put(104, "Radha");
        System.out.println(lm);// {101=Rama, 102=Sita, 103=Krishna, 104=Radha}

        lm.put(104, "Mohini");
        System.out.println(lm);// {..., 104=Mohini}

        lm.put(105, null);
        lm.put(106, null);
        System.out.println(lm);// {..., 105=null, 106=null}
    }
}