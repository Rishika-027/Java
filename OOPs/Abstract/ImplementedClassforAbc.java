package OOPs.Abstract;

public class ImplementedClassforAbc implements AbcInterface3{
    public void m1(){
        System.out.println("m1() from AbcInterface");
    }

    public void m2(){
        System.out.println("m2() from AbcInterface2");
    }

    public void m3(){
        System.out.println("m3() from AbcInterface3");
    }

    public static void main(String[] args) {
        ImplementedClassforAbc imp = new ImplementedClassforAbc();
        imp.m1();//m1() from AbcInterface
        imp.m2();//m2() from AbcInterface2
        imp.m3();//m3() from AbcInterface3
    }
}
