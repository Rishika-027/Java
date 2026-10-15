package BeginnerProblems.BasicMath.BasicRecursion;

import java.util.Scanner;

public class PrimeNumChecking {
    static int count = 0;

    public static boolean checkPrime(int num, int i) {
        if (num % 2 != 0) {
            if (num % i == 0) {
                count++;
            }

            if (count == 2 && i == num) {
                return true;
            } else if (count != 2 && i == num) {
                System.out.println("The given number is Odd");
                return false;
            }

        } else {
            System.out.println("The given number is Even");
            return false;
        }
        return checkPrime(num, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        PrimeNumChecking t = new PrimeNumChecking();
        Boolean res = t.checkPrime(num, 1);
        System.out.println("Is Prime number?: " + res);
    }
}
