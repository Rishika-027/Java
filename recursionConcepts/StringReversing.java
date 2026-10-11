package recursionConcepts;

import java.util.Scanner;

public class StringReversing {
    public static void revString(char[] str, int start, int end) {
        if (start >= end) {
            return;
        }

        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        revString(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        System.out.println("Og String: " + str);
        StringReversing t = new StringReversing();
        t.revString(arr, 0, arr.length - 1);
        System.out.println("Reversed String: " + new String(arr));
    }
}
