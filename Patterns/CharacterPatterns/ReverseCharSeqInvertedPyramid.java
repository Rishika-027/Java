package CharacterPatterns;

import java.util.Scanner;

public class ReverseCharSeqInvertedPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'I';

        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp < i; sp++) {
                System.out.print(" ");
            }

            int j = (2 * n) - i;
            for (char k = ch; k >= ch - (j - i); k--) {
                System.out.print(k);
            }
            System.out.println();
            ch -= 2;
            // IHGFEDCBA
            // GFEDCBA
            // EDCBA
            // CBA
            // A
        }
    }
}
