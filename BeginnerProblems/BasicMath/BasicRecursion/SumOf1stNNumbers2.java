package BeginnerProblems.BasicMath.BasicRecursion;

import java.util.Scanner;

public class SumOf1stNNumbers2 {
    int sumOfNums(int num) {
        if (num < 0) {
            return 0;
        }

        return num + sumOfNums(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SumOf1stNNumbers2 t = new SumOf1stNNumbers2();
        int x = t.sumOfNums(n);
        System.out.println(x);
    }
}
