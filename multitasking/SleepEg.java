package multitasking;

public class SleepEg extends Thread{

    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("child");

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){

            }
        }
    }
    
    public static void main(String[] args) {

        SleepEg se = new SleepEg();
        se.start();
        
        for(int i=0; i<3; i++){
            System.out.println("main");
        }
    }
}

//output:
//after each 3 seconds the user define thread is going to print
//main
//main
//main
//child
//(3 seconds gap)
//child
//(3seconds gap)
//child
