package StarPatterns;

import java.util.Scanner;

public class HallowStarDiamond {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // upper part
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            for (int sp = 0; sp <= (2 * i); sp++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part - 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int sp = 2 * n - i; sp >= i; sp--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part - 2
        // for (int i = 1; i <= n - 1; i++) {
        // for (int j = 1; j <= i + 1; j++) {
        // System.out.print("*");
        // }

        // for (int sp = 2 * n - i; sp >= i + 2; sp--) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }
}
