package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// public class FileNotFoundExcep {

//     public static void main(String[] args) {
//         FileInputStream fs = new FileInputStream("test.java");//Unhandled exception type FileNotFoundException
//     }
// }

// public class FileNotFoundExcep {

//     public static void main(String[] args) {
//         try {
//             FileInputStream fs = new FileInputStream("test.java");
//         } catch (FileNotFoundException e) {
//             // System.out.println(e.getMessage());//test.java (The system cannot find the file specified)
            
//             System.out.println("the requested file is not found in the current directory");//the requested file is not found in the current directory
//         }
//     }
// }

public class FileNotFoundExcep {

    public static void main(String[] args) {
        // Thread.sleep(1000);

        // try{
        //     Thread.sleep(5000);
        //     System.out.println("NAmasteS");
        // }catch(InterruptedException e ){
        //     System.out.println("Interrupted Exception");
        // }

        try{
            int a = 20;
            int b=0;
            System.out.println(a/b);
        }catch(ArithmeticException w){
            System.out.println("not possible");
        }
        finally{
            System.out.println("Finally printing");
        }
    }
}