package NumberPatterns;

import java.util.Scanner;

public class NumberLayredSqPattern1 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < (2 * n) - 1; i++) {
            for (int j = 0; j < (2 * n) - 1; j++) {
                if (i == 0 || j == 0 || i == (2 * n) - 2 || j == (2 * n) - 2) {
                    System.out.print(n + " ");
                } else if (i == 1 || i == (2 * n) - 3 || j == 1 || j == (2 * n) - 3) {
                    System.out.print(n - 1 + " ");
                } else if (i == 2 || i == (2 * n) - 4 || j == 2 || j == (2 * n) - 4) {
                    System.out.print(n - 2 + " ");
                } else if (i == 3 || i == (2 * n) - 5 || j == 3 || j == (2 * n) - 5) {
                    System.out.print(n - 3 + " ");
                } else {

                    System.out.print(n - 4 + " ");
                }
            }
            System.out.println();
            // 5 5 5 5 5 5 5 5 5
            // 5 4 3 3 3 3 3 4 5
            // 5 4 3 2 2 2 3 4 5
            // 5 4 3 2 1 2 3 4 5
            // 5 4 3 2 2 2 3 4 5
            // 5 4 3 3 3 3 3 4 5
            // 5 4 4 4 4 4 4 4 5
            // 5 5 5 5 5 5 5 5 5
            // 5 4 4 4 4 4 4 4 5
        }
    }
}
