package BeginnerProblems.BasicMath.BasicArrays;

public class SumOfArrElems {
    public static void main(String[] args) {
        int[] arr = { 8, 2, 6, 1, 2 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of Array Elements : " + sum);
    }
}
