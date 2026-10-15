package BeginnerProblems.BasicMath.BasicRecursion;

public class PrintingNumsInDesendingOrder {
    static void printNum(int num) {
        if (num == 0) {
            return;
        }

        System.out.println(num);
        printNum(num - 1);
    }

    public static void main(String[] args) {
        printNum(5);
    }
}
