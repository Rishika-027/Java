package recursionConcepts;

public class PrintingNumsFromNTo1 {
    int count = 1;

    void printNum(int num) {
        if (num < count) {
            return;
        }

        System.out.println(num);
        printNum(num - 1);
    }

    public static void main(String[] args) {
        PrintingNumsFromNTo1 t = new PrintingNumsFromNTo1();
        t.printNum(12);
    }
}
