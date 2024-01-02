// You are given an integer ‘n’.

// Function ‘sumOfDivisors(n)’ is defined as the sum of all divisors of ‘n’.

// Find the sum of ‘sumOfDivisors(i)’ for all ‘i’ from 1 to ‘n’.public class sumOfDivisors {

public class sumOfDivisors {
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(5));
    }

    // public static int sumOfAllDivisors(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // sum += sumOfDivisor(i);
    // }
    // return sum;
    // }

    // private static int sumOfDivisor(int i) {
    // int sum = 0;
    // for (int j = 1; j <= i; j++) {
    // if (i % j == 0)
    // sum += j;
    // }
    // return sum;
    // }
    // }
    public static int sumOfAllDivisors(int n) {
        int[] sumOfDivisorsArray = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                sumOfDivisorsArray[j] += i;
            }
        }

        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += sumOfDivisorsArray[i];
        }

        return totalSum;
    }
}