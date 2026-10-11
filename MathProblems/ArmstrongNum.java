// package basicMath;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;
        int ogNum = num;

        // no of digits
        int temp = num;
        while (num > 0) {
            count++;
            num /= 10;
        }

        // sum of digits raise to the power of no. of digits
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, count);
            temp /= 10;
        }

        if (sum == ogNum) {
            // System.out.println(num);
            System.out.println(ogNum + " is a Armstrong number");
        } else {
            // System.out.println(num);
            System.out.println(ogNum + " is not a Armstrong number");
        }

    }
}