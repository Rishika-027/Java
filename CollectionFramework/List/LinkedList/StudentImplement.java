package List.LinkedList;

import java.util.LinkedList;

public class StudentImplement {
    public static void main(String args[]) {
        Student s1 = new Student(101, "Rishika");
        Student s2 = new Student(102, "Maha");
        Student s3 = new Student(103, "Aadhya");

        LinkedList student = new LinkedList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);

        System.out.println(student.toString());
    }
}
