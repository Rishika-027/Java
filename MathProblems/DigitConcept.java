// package basicMath;

import java.util.Scanner;

public class DigitConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while (num > 0) {
            // int lastDigit = num%10;
            // System.out.println("digit from given number: " + lastDigit);
            count++;
            num = num / 10;
        }
        System.out.println("total count o digits of number: " + count);
    }
}
