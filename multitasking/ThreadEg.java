package multitasking;

//example for main thread
// public class ThreadEg {

//     //main thread (predefine)
//     public static void main(String[] args) {
//         for(int i=0; i<3; i++){
//             System.out.println("main thread");//main thread  main thread  main thread
//         }
//     }
// }


//example for user define thread
public class ThreadEg extends Thread{

    //users define
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("user thread");
        }
    }

    //main thread (predefine)
    public static void main(String[] args) {

        ThreadEg te = new ThreadEg();
        System.out.println(te);//Thread[#27,Thread-0,5,main]
        // te.start();//main thread  user thread  user thread  user thread  main thread  main thread
        // the output for te.start() is not in a sequence i.e we cannot expect output properly on using start() 

        te.run();//user thread  user thread  user thread  main thread  main thread  main thread
        for(int i=0; i<3; i++){
            System.out.println("main thread");//main thread  main thread  main thread
        }
        
    }
}
