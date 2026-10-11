package modifiers.Default1;

public class DefaultEg1 {
    
    int a = 20;

    void sum(){
        System.out.println(a + 20);
    }

    public static void main(String[] args) {
        DefaultEg1 de = new DefaultEg1();
        System.out.println(de.a);//20
        de.sum();//40
    }
}
