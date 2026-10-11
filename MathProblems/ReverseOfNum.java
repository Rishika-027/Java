
// package basicMath;

import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revNum = 0;
        int temp = num;

        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            revNum = (revNum * 10) + lastDigit;
        }
        System.out.println("reverse of given number is: " + revNum);
    }
}
