package OOPs.Ploymorphism;

//number of parameters
// public class MethodOverloadingEg {
    
//     void test(String name){
//         System.out.println("test()-1");
//     }

//     void test(int x, String name){
//         System.out.println("test()-2");
//     }

//     public static void main(String[] args) {
//         MethodOverloadingEg mol = new MethodOverloadingEg();
//         mol.test(27, "rishika");//test()-2
//         mol.test("krishna");//test()-1
//     }
// }


//change in order
// public class MethodOverloadingEg {
    
//     void test(String name, int x){
//         System.out.println("test()-1");
//     }

//     void test(float y, boolean stmt){
//         System.out.println("test()-2");
//     }

//     public static void main(String[] args) {
//         MethodOverloadingEg mol = new MethodOverloadingEg();
//         mol.test(27.29f, true);//test()-2
//         mol.test("radha",72);//test()-1
//     }
// }


//change in data type 
// public class MethodOverloadingEg {
    
//     void test(String name){
//         System.out.println("test()-1");
//     }

//     void test(float y){
//         System.out.println("test()-2");
//     }

//     public static void main(String[] args) {
//         MethodOverloadingEg mol = new MethodOverloadingEg();
//         mol.test(27.29f);//test()-2
//         mol.test("radha");//test()-1
//     }
// }


// method overloading with inheritance
// public class MethodOverloadingEg {
    
//     void test(String name){
//         System.out.println("name: " + name);
//     }

//     public static void main(String[] args) {
//         MethodOverloadingEg mol = new MethodOverloadingEg();
//         mol.test("radha");//name: radha
//     }
// }


//method overloading with static, private and final
public class MethodOverloadingEg {

    // static void test(String n){
    //     System.out.println(n);
    // }

    // static void test(int x){
    //     System.out.println(x);
    // }


    // private void test(String n){
    //     System.out.println(n);
    // }

    // private void test(int x){
    //     System.out.println(x);
    // }
    

    // final void test(String n){
    //     System.out.println(n);
    // }

    // final void test(int x){
    //     System.out.println(x);
    // }

    final int a = 100;
    public static void main(String[] args) {
        MethodOverloadingEg mol = new MethodOverloadingEg();
        System.out.println(mol.a);//100
        // mol.a = 527;// re-intialization (if final keyword is used then this line throws error)
        System.out.println(mol.a);//527 this will become -> 100
    }


    //non-static and static methods overloading
    // void test(String n){
    //     System.out.println(n);
    // }

    // static void test(int x){
    //     System.out.println(x);
    // }
    // public static void main(String[] args) {
    //     MethodOverloadingEg mol = new MethodOverloadingEg();
    //     mol.test("jai");//jai
    //     // mol.test(27);//27
    //     test(527);//527
    // }
}