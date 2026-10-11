package CharacterPatterns;

public class CharDecreasingHalfPyramid {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            for (char j = 'A'; j <= 'E' - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
