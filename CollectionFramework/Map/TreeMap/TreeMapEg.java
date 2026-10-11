package Map.TreeMap;

import java.util.TreeMap;

public class TreeMapEg {
    public static void main(String args[]) {

        TreeMap lm = new TreeMap<>();
        lm.put(101, "Rama");
        lm.put(104, "Radha");
        lm.put(103, "Krishna");
        lm.put(105, "Sita");
        System.out.println(lm);// {101=Rama, 102=Sita, 103=Krishna, 104=Radha}

        lm.put(104, "Mohini");
        // System.out.println(lm);//{..., 104=Mohini}

        lm.put(105, null);
        lm.put(106, null);
        // System.out.println(lm);//{..., 105=null, 106=null}

        // lm.put(null, "r");
        // System.out.println(lm);//java.lang.NullPointerException
    }
}
