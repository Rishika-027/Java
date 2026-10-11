package StarPatterns;

import java.util.Scanner;

public class StarDiamond {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for upper part of diamond: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int sp = n; sp > i; sp--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int sp = i; sp < n; sp++) {
                System.out.print(" ");
            }

            for (int j = (2 * i) - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
