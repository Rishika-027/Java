package multitasking;

public class ThreadEgRunnable implements Runnable{

    //user define
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("runnable- user thread");
        }
    }

    //main thread (predefine)
    public static void main(String[] args) {
        for(int i=0; i<3; i++){
            System.out.println("runnable- main thread");//runnable- main thread  runnable- main thread  runnable- main thread
        }
        
        ThreadEgRunnable tr = new ThreadEgRunnable();
        // System.out.println(tr);//MultiThreading.ThreadEgRunnable@1dbd16a6
        // tr.run();//runnable- user thread  runnable- user thread  runnable- user thread

        Thread th = new Thread(tr);
        th.start();//runnable- main thread  runnable- main thread  runnable- main thread  runnable- user thread  runnable- user thread  runnable- user thread
        // as we are using start() we cannot expect the output it can be in sequence or not
    }
    
}
