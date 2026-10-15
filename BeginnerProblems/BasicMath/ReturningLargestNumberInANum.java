package BeginnerProblems.BasicMath;

import java.util.Scanner;

public class ReturningLargestNumberInANum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        int largerNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit > largerNum) {
                largerNum = lastDigit;
            }
            num = num / 10;
        }
        System.out.println("Largest number is: " + largerNum);

    }
}