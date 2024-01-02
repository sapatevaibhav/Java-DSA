// You are given an integer ‘n’.

// Your task is determining the sum of the first ‘n’ natural numbers and returning it.

public class sumOfnNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumFirstN(100));
    }

    public static long sumFirstN(long n) {
        long l = n;
        if (n > 0)
            l += sumFirstN(n - 1);
        return l;
        // Write your code here.
        // return (n * (n + 1) / 2);
    }
}
