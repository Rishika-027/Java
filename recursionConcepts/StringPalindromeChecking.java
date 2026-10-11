package recursionConcepts;

import java.util.Scanner;

public class StringPalindromeChecking {
    public static boolean isPalindrom(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindrom(str, left + 1, right - 1);
    }

    public static boolean palinCheck(String str) {
        if (str == null)
            return false;
        return isPalindrom(str, 0, str.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str = "madam";
        System.out.println("Og string: " + str);
        StringPalindromeChecking t = new StringPalindromeChecking();
        Boolean res = t.palinCheck(str);
        System.out.println("Is Palindrome: " + res);
    }
}
