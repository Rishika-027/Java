package OOPs;

public class ThisKey {
    
    //case-1
    // int a = 10;

    // public void test(){
    //     System.out.println(a);//10
    // }

    // //case-2 
    // public void test2(){
    //     int a = 27;
    //     System.out.println(a);//27
    // }

    // //case-3
    // public void test3(){
    //     int a = 29;
    //     System.out.println(a);
    //     System.out.println(this);
    //     System.out.println(this.a);
    // }

    String name = "Jai";
    
    public void test(){
        String username = "Rama";
        System.out.println(username);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        
        ThisKey tk = new ThisKey();
        System.out.println(tk);
        // tk.test3();
        tk.test();
    }
}
