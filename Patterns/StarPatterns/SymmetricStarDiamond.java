package StarPatterns;

public class SymmetricStarDiamond {
    public static void main(String args[]) {

        for (int i = 1; i <= 3; i++) {
            for (int sp = 3; sp > i; sp--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int sp = 1; sp < i; sp++) {
                System.out.print(" ");
            }

            for (int j = 5; j >= (2 * i) - 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
