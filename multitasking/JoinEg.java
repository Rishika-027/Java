package multitasking;

public class JoinEg extends Thread {
    
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("join method- child");
        }
    }
    public static void main(String[] args) throws InterruptedException{
     
        JoinEg je =  new JoinEg();
        je.start();
        je.join();
        for(int i=0; i<3; i++){
            System.out.println("join method- main");
        }

    }
}

//output: 
// join method- child
// join method- child
// join method- child
// join method- main
// join method- main
// join method- main
