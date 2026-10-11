package List.LinkedList;

class Student {
    int idNo;
    String name;

    // Constructor
    Student(int idNo, String name) {
        this.idNo = idNo;
        this.name = name;
    }

    // toString()
    @Override
    public String toString() {
        return "[idNo:" + idNo + ", Name:" + name + "]";
    }
}