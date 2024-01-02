// You are given an integer ’n’.

// Your task is to return a sorted array (in increasing order) containing all the factorial numbers which are less than or equal to ‘n’.

// The factorial number is a factorial of a positive integer, like 24 is a factorial number, as it is a factorial of 4.

// In the output, you will see the array returned by you.
import java.util.ArrayList;
import java.util.List;

public class factorialTillN {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(7));
    }

    public static List<Long> factorialNumbers(long n) {
        List<Long> result = new ArrayList<>();

        for (long i = 1; i <= n; i++) {
            long currentFactorial = calculateFactorial(i);
            if (currentFactorial <= n) {
                result.add(currentFactorial);
            } else {
                break; // Stop adding factorials once they exceed 'n'
            }
        }

        return result;
    }

    private static long calculateFactorial(long num) {
        if (num <= 1) {
            return 1L;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
