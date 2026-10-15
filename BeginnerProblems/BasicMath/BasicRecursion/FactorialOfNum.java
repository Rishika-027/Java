package BeginnerProblems.BasicMath.BasicRecursion;

public class FactorialOfNum {
    int fact = 1;

    int factOfNum(int num) {
        if (num < 1) {
            return 1;
        }
        return num * factOfNum(num - 1);
    }

    public static void main(String[] args) {
        FactorialOfNum t = new FactorialOfNum();
        int x = t.factOfNum(5);
        System.out.println(x);
    }
}
