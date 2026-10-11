package recursionConcepts;

public class PrintingNumsFrom1ToN {
    int number = 1;

    void printNum(int n) {
        if (number > n) {
            return;
        }

        System.out.println(number);
        number++;
        printNum(n);
    }

    public static void main(String[] args) {
        PrintingNumsFrom1ToN t = new PrintingNumsFrom1ToN();
        t.printNum(10);
    }
}
