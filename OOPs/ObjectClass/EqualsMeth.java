package OOPs.ObjectClass;

public class EqualsMeth extends Object {
    String name;

    EqualsMeth(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        EqualsMeth s = (EqualsMeth) obj;
        return this.name.equals(s.name);
    }

    public static void main(String[] args) {
        EqualsMeth s1 = new EqualsMeth("Rishika");
        EqualsMeth s2 = new EqualsMeth("Rishika");
        System.out.println(s1.equals(s2));// true
    }
}
