package java8features;

public class DemoClass implements DemoInterface {
    @Override
    public void m1() {
        System.out.println("This is m1 method");
    }

    public static void main(String[] args) {
        DemoInterface demIn = () -> System.out.println("This is Demo class from Demo interface");
        demIn.m1();// This is Demo class from Demo interface
        demIn.m3();// default method
        DemoInterface.m2();// static method

        // implicit return
        // DemoInterface demIn2 = (a,b)->a+b;
        // int res = demIn2.add(5, 9);
        // System.out.println(res);

        // explicit return
        // DemoInterface demIn2 = (a,b)->{return a+b;};
        // int res = demIn2.add(2,9);
        // System.out.println(res);
    }
}
