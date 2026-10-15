package BeginnerProblems.BasicMath;

import java.util.Scanner;

// public class ReverseOfNum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int revNum = 0;

//         while (num > 0) {
//             int lastDigit = num % 10;
//             num = num / 10;
//             revNum = (revNum * 10) + lastDigit;
//         }
//         System.out.println("reverse of given number is: " + revNum);
//     }
// }

import java.lang.Math;

public class ReverseOfNum {
    public static int reverse(int num) {
        int revNum = 0;

        boolean isNegative = num < 0;

        int x = Math.abs(num);
        while (x > 0) {
            int digit = x % 10;
            x /= 10;
            revNum = revNum * 10 + digit;
        }

        if (isNegative) {
            return -revNum;
        }

        return revNum;
    }

    public static void main(String[] args) {
        ReverseOfNum rn = new ReverseOfNum();
        int res = rn.reverse(-1200);
        System.out.println("reverse of the" + -1200 + " is " + res);
    }

}