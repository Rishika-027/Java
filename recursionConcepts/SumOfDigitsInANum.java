package recursionConcepts;

import java.util.Scanner;

public class SumOfDigitsInANum {
    int sum = 0;

    int sumOfDigits(int num) {

        if (num == 0) {
            return sum;
        }
        int lastDigit = num % 10;
        sum += lastDigit;
        num = num / 10;
        return sumOfDigits(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        SumOfDigitsInANum t = new SumOfDigitsInANum();
        int res = t.sumOfDigits(num);
        System.out.println("Sum of Digits: " + res);
    }
}
