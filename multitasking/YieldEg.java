package multitasking;

public class YieldEg extends Thread {

    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("yield method- child");
        }
    }
    public static void main(String[] args) {

        YieldEg ye = new YieldEg();
        ye.start();
        ye.yield();

        for(int i=0; i<3; i++){
            System.out.println("yeild method- main");
        }
    }
}

//output:
// yeild method- main
// yield method- child
// yield method- child
// yield method- child
// yeild method- main
// yeild method- main
