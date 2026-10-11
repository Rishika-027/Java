package NumberPatterns;

import java.util.*;

public class NumberLayredSqPattern2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int bottom = (2 * n - 2) - i;
                int left = j;
                int right = (2 * n - 2) - j;
                System.out.print(n - Math.min(Math.min(left, right), Math.min(top, bottom)) + " ");
            }
            System.out.println();
        }
    }

}

// output:

// 5 5 5 5 5 5 5 5 5
// 5 4 3 3 3 3 3 4 5
// 5 4 3 2 2 2 3 4 5
// 5 4 3 2 1 2 3 4 5
// 5 4 3 2 2 2 3 4 5
// 5 4 3 3 3 3 3 4 5
// 5 4 4 4 4 4 4 4 5
// 5 5 5 5 5 5 5 5 5
// 5 4 4 4 4 4 4 4 5