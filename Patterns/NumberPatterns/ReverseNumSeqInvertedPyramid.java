package NumberPatterns;

import java.util.Scanner;

public class ReverseNumSeqInvertedPyramid {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp < i; sp++) {
                System.out.print(" ");
            }

            int j = (n * 2) - i;
            for (int k = j - i + 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
