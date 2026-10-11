package recursionConcepts;

public class Fibonacci {
    int count = 0;

    void fib(int n, int prev, int next) {

        if (count == n) {
            return;
        }

        System.out.println(prev);

        count++;

        fib(n, next, prev + next);
    }

    public static void main(String[] args) {
        Fibonacci t = new Fibonacci();
        t.fib(5, 0, 1);
    }
}
