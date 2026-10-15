package BeginnerProblems.BasicMath.BasicArrays;

public class CheckingArrIsSorted {
    public static void main(String[] args) {
        // int[] ar = { 5, 4, 8, 3, 1 };
        int[] ar = { 1, 3, 4, 5, 8 };
        int i = 0;
        boolean isSorted = false;
        for (int j = 1; j < ar.length; j++) {
            if (ar[i] > ar[j]) {
                i = j;
                isSorted = false;
            } else {
                i = j;
                isSorted = true;
            }
        }
        System.out.println("Array is sorted: " + isSorted);
    }
}
