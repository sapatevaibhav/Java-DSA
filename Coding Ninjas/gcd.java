// You are given two integers 'n', and 'm'.
// Calculate 'gcd(n,m)', without using library functions.
// The greatest common divisor (gcd) of two numbers 'n' and 'm' is the largest positive number that divides both 'n' and 'm' without leaving a remainder.

public class gcd {
    public static void main(String[] args) {
        System.out.println(calcGCD(6, 9));
    }

    public static int calcGCD(int n, int m) {
        int min = Math.min(n, m);
        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0)
                gcd = i;
        }
        return gcd;
        // Write your code here.
    }
}
