package OOPs.Constructor;

import java.lang.reflect.Constructor;

public class SuperMeth2 extends SuperMeth {
    SuperMeth2() {
        super(527);
        System.out.println("non-paramaterized constructor ");
    }

    public static void main(String[] args) {
        SuperMeth2 con = new SuperMeth2();
    }
}
// output: parameterized constructor 527
// non-paramaterized constructor
