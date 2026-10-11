package StarPatterns;

public class InvertedStarPyramidWithoutSpace {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            // space
            for (int sp = 1; sp < i; sp++) {
                System.out.print(" ");
            }

            for (int j = 9; j >= (2 * i) - 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
