
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]) {
        Employee emp1 = new Employee(101, "Rishika", 120000);
        Employee emp2 = new Employee(102, "Krishna", 100000);

        // System.out.println(emp1);
        List l1 = new ArrayList();
        l1.add(emp1);
        l1.add(emp2);

        System.out.println(l1);
    }
}
