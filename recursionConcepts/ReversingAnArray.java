package recursionConcepts;

import java.util.Arrays;

public class ReversingAnArray {
    int revArr(int arr[], int start, int end) {
        if (start >= end) {
            return 0;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return revArr(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        ReversingAnArray t = new ReversingAnArray();
        System.out.println("Og arr: " + Arrays.toString(arr));// Og arr: [1, 2, 3, 4,5]
        t.revArr(arr, 0, arr.length - 1);
        System.out.println("Reversed arr: " + Arrays.toString(arr));// Reversed arr:[5, 4, 3, 2, 1]
    }
}
