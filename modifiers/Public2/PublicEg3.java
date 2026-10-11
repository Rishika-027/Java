package modifiers.Public2;

import modifiers.Public1.PublicEg1;

public class PublicEg3 {
    
    public static void main(String args[]){
        PublicEg1 pe3 = new PublicEg1();
        System.out.println(pe3.a);//27 
        pe3.test();//test()
    }
}
