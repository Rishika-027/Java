
import java.util.Scanner;

public class CountingPrimeNumsTillN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for (int i = 2; i <= num; i++) {

            int factors = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                count++;
            }
        }

        System.out.println("Count of prime numbers is: " + count);
    }
}
