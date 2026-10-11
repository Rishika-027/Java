package modifiers.Protected1;

public class ProtectedEg1 {
    
    protected String name = "Jai";

    protected void details(){
        System.out.println("His name is "+ name);
    }

    public static void main(String[] args) {
        ProtectedEg1 pro = new ProtectedEg1();
        System.out.println(pro.name);//Jai
        pro.details();//His name is Jai
    }
}
