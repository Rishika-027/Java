package BeginnerProblems.BasicMath.BasicRecursion;

public class CheckingArrayisSortedOrNot {
    public static boolean isSorted(int[] arr, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (arr[start] > arr[start + 1]) {
            return false;
        }

        return isSorted(arr, start + 1, end);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 2, 6, 3, 8, 4, 0 };
        int[] arr2 = { 10, 20, 30, 40, 50, 60 };

        CheckingArrayisSortedOrNot t = new CheckingArrayisSortedOrNot();
        boolean res1 = t.isSorted(arr1, 0, arr1.length - 1);
        boolean res2 = t.isSorted(arr2, 0, arr2.length - 1);
        System.out.println("Is sorted: " + res1);
        System.out.println("Is sorted: " + res2);
    }
}
