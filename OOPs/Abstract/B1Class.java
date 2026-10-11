package OOPs.Abstract;

public class B1Class implements A1Interface, A2Interface{
    
    public void demo1(){
        System.out.println("demo1() from A1Interface");
    }

    public void demo2(){
        System.out.println("demo2() from A2Interface");
    }

    public static void main(String[] args) {
        B1Class bc = new B1Class();
        bc.demo1();//demo1() from A1Interface
        bc.demo2();//demo2() from A2Interface
    }
}
