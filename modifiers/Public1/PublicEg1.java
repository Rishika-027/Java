package modifiers.Public1;

public class PublicEg1 {
    
    public int a = 27;

    public void test(){
        System.out.println("test()");
    }

    public static void main(String args[]){

        PublicEg1 pe1 = new PublicEg1();
        System.out.println(pe1.a);//27
        pe1.test();//test()
    }
}
