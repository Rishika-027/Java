package OOPs.Ploymorphism;

public class MethodOverrideEg2 extends MethodOverrideEg1{
    void test(int y){
        System.out.println("test()-2");
    }

    public static void main(String[] args) {
        MethodOverrideEg2 mor2 = new MethodOverrideEg2();
        mor2.test(27);//test()-2

        MethodOverrideEg1 mor1 = new MethodOverrideEg1();
        mor1.test(72);//test()-1
    }

    // private void test(int y){
    //     System.out.println("test()-2");
    // }

    // public static void main(String[] args) {
    //     MethodOverrideEg2 mor2 = new MethodOverrideEg2();
    //     mor2.test(27);//test()-2
        
    //     // MethodOverrideEg1 mor1 = new MethodOverrideEg1();
    //     // mor1.test(72);//erro: not visible
    // }


    // final void test(int y){
    //     System.out.println("test()-2");//error: cannot overridde the final method
    // }
}

