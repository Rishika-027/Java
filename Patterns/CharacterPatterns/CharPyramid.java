package CharacterPatterns;

public class CharPyramid {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int sp = 4; sp > i; sp--) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2 * i) / 2;
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(ch);
                if (j < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
