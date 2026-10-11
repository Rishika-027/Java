package OOPs.Constructor;

import java.lang.reflect.Constructor;

public class ThisMeth {

    ThisMeth() {
        // this("rishika");
        System.out.println("non-parameterized constructor");
    }

    ThisMeth(String n) {
        this();
        System.out.println("parameterized constructor " + n);
    }

    public static void main(String[] args) {
        ThisMeth con = new ThisMeth("Rishika");
    }
}

// output: non-parameterized constructor
// parameterized constructor Rishika