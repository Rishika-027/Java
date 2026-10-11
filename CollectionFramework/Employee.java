
public class Employee {
    int empNo;
    String empName;
    int empSal;

    public Employee(int empNo, String empName, int empSal) {
        this.empName = empName;
        this.empNo = empNo;
        this.empSal = empSal;
    }

    // @Override
    public String toString() {
        return "[Employee No.: " + empNo + " " + "Employee Name: " + empName + " " + "Employee Salary: " + empSal + "]";
    }

}
