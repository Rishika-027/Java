package BeginnerProblems.BasicMath.BasicRecursion;

public class PrintingNamesForNTimes {
    static int count = 0;

    static void printName(String name) {
        if (count > name.length()) {
            return;
            // System.out.println("Condition not satisfied");
        }
        System.out.println(name + " " + count);
        count++;
        printName(name);
    }

    public static void main(String[] args) {
        PrintingNamesForNTimes t = new PrintingNamesForNTimes();
        t.printName("Rishika");
    }
}
