package OOPs.Abstract;

public class InterfaceEg2 implements InterfaceEg{
    public void demo(){
        System.out.println("call from child class");
    }

    public static void main(String[] args) {
        InterfaceEg2 int2 = new InterfaceEg2();
        System.out.println(int2.a);//527
        int2.demo();//call from child class
    }
}
