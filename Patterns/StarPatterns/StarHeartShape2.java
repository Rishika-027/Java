package StarPatterns;

import java.util.Scanner;

public class StarHeartShape2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // upper part
        for (int i = 0; i <= n; i++) {
            for (int sp = n; sp > i; sp--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            for (int sp = (2 * n) - i; sp >= i; sp--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        int m = 1;
        int k = (4 * n) - 1;
        for (int i = 1; i <= 1; i++) {
            for (int j = k; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = k; i >= 1; i--) {
            if (i % 2 != 0) {
                for (int sp = 1; sp <= k - (i - 1) - m; sp++) {
                    System.out.print(" ");
                }
                m++;// mandatory!! (if m++ is inside the sp loop then m=1 wont replace with
                // m++ value bcoz, it is written inside the loop after print stmt until the
                // condition get false the interpreter wont go for the next line so space
                // calculation can be incorrect)

                for (int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
