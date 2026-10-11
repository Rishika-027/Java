package multitasking.Synchronization;

public class ClassRoom {
    
    // synchronized void takeClass(String faculty){
    //     for(int i=1; i<=7; i++){
    //         System.out.println("class " + i + " is taken by " + faculty);
    //     }
    // }

    void takeClass(String faculty){
        synchronized(this){
            for(int i=1; i<=7; i++){
                System.out.println("class " + i + " is taken by " + faculty);
            }
        }
    }
    
}
