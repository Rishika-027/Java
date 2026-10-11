package exceptionHandling;

import java.nio.channels.InterruptedByTimeoutException;

// public class ThrowsEg {

//     public void m1() throws InterruptedException{
//         Thread.sleep(2000);
//         System.out.println("m1()");
//     }

//     public void m2() throws InterruptedException{
//         m1();
//         System.out.println("m2()");
//     }

//     public void m3() throws InterruptedException{
//         m2();
//         System.out.println("m3()");
//     }

//     public void m4() throws InterruptedException{
//         m3();
//         System.out.println("m4()");
//     }

//     public static void main(String[] args) {
//         ThrowsEg te = new ThrowsEg();
//         // te.m1();//Unhandled exception type InterruptedException


//         /* Before assigning "throws" keyword */
//         // te.m2();//m2()
//         // te.m3();//m3()
//         // te.m4();//m4()

//         /* After assigining "throws" keyword */
//         // te.m2();//Unhandled exception type InterruptedException
//         // te.m3();//Unhandled exception type InterruptedException
//         // te.m4();//Unhandled exception type InterruptedException

//         /* using try-catch block */
//         try{
//             te.m4();
//         }catch(Exception e){
//             // te.m2();
//         }
//     }

// }

//Output:
// *** After 2 seconds of tym 
// m1()
// m2()
// m3()
// m4()



public class ThrowsEg {

    public void m1() throws Exception{
        Thread.sleep(2000);
        System.out.println("m1()");

        // int a =10;
        // int b = 0;
        // System.out.println(a/b);
    }

    // public static void main(String[] args) {
    //     ThrowsEg te = new ThrowsEg();
    //     try{
    //         te.m1();
    //     }
    //     catch(Exception e){
    //         System.out.println("Handled in main method: divided by zero is not possible");
    //     }
    // }

    public static void main(String[] args) throws InterruptedByTimeoutException{
        ThrowsEg te = new ThrowsEg();
        try{
            te.m1();// after 2 seconds -> m1()
        }catch(Exception e){

        }
    }
}

//Output:
// ** After 2 seconds of tym 
//m1()