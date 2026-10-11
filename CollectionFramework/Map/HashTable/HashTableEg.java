package Map.HashTable;

import java.util.Hashtable;

public class HashTableEg {
    public static void main(String[] args) {

        Hashtable ht = new Hashtable<>();
        ht.put(101, "Rishika");
        ht.put("102", "Anamika");
        ht.put(true, "Rama");
        // ht.put(null, null);
        ht.put(103, 100);
        System.out.println(ht);// {true=Rama, 102=Anamika, 103=100, 101=Rishika}
    }
}
