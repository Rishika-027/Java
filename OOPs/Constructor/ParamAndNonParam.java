package OOPs.Constructor;

import java.lang.reflect.Constructor;

public class ParamAndNonParam {

    ParamAndNonParam(int x) {
        System.out.println("parameterized constructor");
    }

    ParamAndNonParam() {
        System.out.println("non-parameterized constructor");
    }

    public static void main(String[] args) {
        ParamAndNonParam con = new ParamAndNonParam(527);// parameterized constructor
    }
}
