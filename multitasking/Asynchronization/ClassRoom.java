package multitasking.Asynchronization;

public class ClassRoom {
    
    void takeClass(String faculty){
        for(int i=1; i<=2; i++){
            System.out.println("class " + i + " is taken by " + faculty);
        }
    }
    
}
