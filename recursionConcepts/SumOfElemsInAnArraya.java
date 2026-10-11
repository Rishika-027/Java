package recursionConcepts;

public class SumOfElemsInAnArraya {
    int sum = 0;

    int sumOfArr(int[] arr, int start, int end) {
        if (start > end) {
            return sum;
        }
        sum += arr[start];
        return sumOfArr(arr, start + 1, end);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 7, 5, 2, 9 };
        SumOfElemsInAnArraya t = new SumOfElemsInAnArraya();
        int res = t.sumOfArr(arr, 0, arr.length - 1);
        System.out.println("Sum of elements: " + res);
    }
}
