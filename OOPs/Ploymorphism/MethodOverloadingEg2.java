package OOPs.Ploymorphism;

public class MethodOverloadingEg2 extends MethodOverloadingEg{

    void test(int n){
        System.out.println("n: " + n);
    }

    public static void main(String[] args) {
        MethodOverloadingEg2 mol2 = new MethodOverloadingEg2();
        mol2.test(27);//n: 27
        // mol2.test("jai");//name: jai
    }
}