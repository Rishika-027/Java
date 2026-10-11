package java8features;

public class MethodRefClss {
    
    //static method
    public static void test(){
        System.out.println("static method");
    }

    //non-static or instance method
    void demo(){
        System.out.println("instance method");
    }

    //construnctor
    MethodRefClss(){
        System.out.println("constructor method");
    }
}
