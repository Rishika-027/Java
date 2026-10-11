package modifiers.Protected2;

import modifiers.Protected1.ProtectedEg1;

public class ProtectedEg3 extends ProtectedEg1{
    public static void main(String[] args) {
        ProtectedEg3 pro3 = new ProtectedEg3();
        System.out.println(pro3.name);//Jai
        pro3.details();//His name is Jai
        
    }
}
