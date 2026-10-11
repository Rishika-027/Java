    
package multitasking.Asynchronization;

public class ImplementedClassForAsynchronize{
    public static void main(String[] args) {
        ClassRoom c1 = new ClassRoom();

        FacultyThread ft1 = new FacultyThread(c1, "Rishika");
        FacultyThread ft2 = new FacultyThread(c1, "Maha");

        ft1.start();
        ft2.start();
    }
}
