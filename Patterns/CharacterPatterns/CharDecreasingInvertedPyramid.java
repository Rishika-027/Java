package CharacterPatterns;

import java.util.Scanner;

public class CharDecreasingInvertedPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp < i; sp++) {
                System.out.print(" ");
            }

            int j = (2 * n) - i;
            for (char k = 'A'; k < 'A' + (j - i + 1); k++) {
                System.out.print(k);
            }
            System.out.println();
            // ABCDEFGHI
            // ABCDEFG
            // ABCDE
            // ABC
            // A
        }
    }
}
