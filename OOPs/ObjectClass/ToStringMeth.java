package OOPs.ObjectClass;

public class ToStringMeth extends Object {
    public String toString() {
        return "Hello from object class";
    }

    public static void main(String[] args) {
        ToStringMeth obj = new ToStringMeth();
        System.out.println(obj);// ObjectClass@1dbd16a6
        // after toString()
        System.out.println(obj);// Hello from object class
    }
}
