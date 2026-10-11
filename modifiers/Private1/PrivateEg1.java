package modifiers.Private1;

public class PrivateEg1 {
    
    private String name = "Rama";

    private void details(){
        System.out.println("name is "+ name);
    }

    public static void main(String[] args) {
        PrivateEg1 pri = new PrivateEg1();
        System.out.println(pri.name);//Rama
        pri.details();//name is Rama
    }
}
