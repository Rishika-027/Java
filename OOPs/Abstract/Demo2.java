package OOPs.Abstract;

public class Demo2 extends Demo{
    
    public void test(){
        System.out.println("abstract method overriden");
    }

    public static void main(String[] args) {
        Demo2 de = new Demo2();
        de.test();//constructor method
                  // abstract method overriden
        de.test2();//concrete method
    }
}
