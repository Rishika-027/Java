package BeginnerProblems.BasicMath.BasicArrays;

public class CountOfOddNums {
    public static void main(String[] args) {
        // int[] arr = { 8, 2, 6, 1, 2 };
        int[] arr = { 9, 4, 1, 4, 0, 3, 2 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Count of odd numbers in an arr: " + count);
    }
}
