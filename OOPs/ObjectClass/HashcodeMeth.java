package OOPs.ObjectClass;

public class HashcodeMeth {
    String name;

    HashcodeMeth(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        HashcodeMeth obj = new HashcodeMeth("Rishika");
        System.out.println(obj.name);// Rishika
        System.out.println(obj.hashCode());// 498931366
    }
}
