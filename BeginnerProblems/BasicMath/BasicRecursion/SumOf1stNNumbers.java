package BeginnerProblems.BasicMath.BasicRecursion;

import java.util.Scanner;

public class SumOf1stNNumbers {
    void sumOfNums(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNums(i - 1, sum + i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SumOf1stNNumbers t = new SumOf1stNNumbers();
        t.sumOfNums(n, 0);
    }
}
