package Set;

import java.util.HashSet;
import java.util.Set;

public class EmpEg {

    int empNo;
    String empName;
    int empSal;

    // Construtor
    EmpEg(int empNo, String empName, int empSal) {
        this.empNo = empNo;
        this.empSal = empSal;
        this.empName = empName;
    }

    // toString()
    @Override
    public String toString() {
        return "[Employee No.: " + empNo + ", Employee Name: " + empName + ", Employee Salary :" + empSal + "]";
    }
}
