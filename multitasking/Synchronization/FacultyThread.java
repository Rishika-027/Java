package multitasking.Synchronization;

public class FacultyThread extends Thread{
    ClassRoom c1;// object reference of class ClassRoom
    String faculty;

    FacultyThread(ClassRoom c1, String faculty){
        this.c1 = c1;
        this.faculty = faculty;
    }

    public void run(){
        c1.takeClass(faculty);
    }
}
