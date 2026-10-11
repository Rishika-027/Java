package java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefineFuncInt {
    public static void main(String[] args) {
        //Predicate-test()
        // Predicate<Integer> p = (val)->val > 15;
        // System.out.println(p.test(5));//false


        //Function-apply()
        // Function<Integer, Integer> f = (val)->val*val;
        // System.out.println(f.apply(5));//25


        //Consumer-accept()
        // Consumer<String> con = val->System.out.println(val);
        // con.accept("Namaste");//Namaste

        //Supplier-get()
        Supplier sup = ()->Math.random();
        System.out.println(sup.get());//0.44653944563469183
    }
}
