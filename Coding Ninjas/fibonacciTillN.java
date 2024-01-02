import java.util.Arrays;

/**
 * Given an integer ‘n’, return first n Fibonacci numbers using a generator
 * function.
 */
public class fibonacciTillN {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateFibonacciNumbers(3)));
    }

    public static int[] generateFibonacciNumbers(int n) {
        int ret[] = new int[n];
        if (n > 0)
            ret[0] = 0;
        if (n > 1)
            ret[1] = 1;
        if (n > 2)
            ret[2] = 1;
        if (n > 3)
            for (int i = 3; i < n; i++) {
                ret[i] = ret[i - 1] + ret[i - 2];
            }
        return ret;
        // Write your code here.
    }
}