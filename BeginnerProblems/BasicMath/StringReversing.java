package BeginnerProblems.BasicMath;

import java.util.Scanner;

public class StringReversing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);

        // Reverse the string
        // reverse the char at half of the string
        for (int i = 0; i < sb.length() / 2; i++) {

            // index
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 = 4

            // characters
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            // setting characters at index
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
