package CharacterPatterns;

import java.util.Scanner;

public class CharIncreasingPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int sp = n - i; sp > 0; sp--) {
                System.out.print(" ");
            }

            for (char j = 'A'; j < 'A' + (2 * i - 1); j++) { // j<'A' + (2*i-1) => for i=1, j<A+1 i.e
                // A and B so j<B so prints A
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
