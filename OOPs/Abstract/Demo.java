package OOPs.Abstract;

abstract public class Demo {
    //abstract method
    public abstract void test();

    //concrete method
    public void test2(){
        System.out.println("concrete method");
    }

    //main method
    public static void main(String[] args) {
        System.out.println("main method");//main method
    }

    //constructor
    Demo(){
        System.out.println("constructor method");
    }
}

