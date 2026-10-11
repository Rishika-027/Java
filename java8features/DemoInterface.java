package java8features;

// @FunctionalInterface
public interface DemoInterface {

    public void m1();
    // public int add(int a,int b);

    static void m2(){
        System.out.println("static method");
    };
    default void m3(){
        System.out.println("default method");
    };
}