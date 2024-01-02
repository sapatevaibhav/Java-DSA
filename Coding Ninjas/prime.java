// A prime number is a positive integer that is divisible by exactly 2 integers, 1 and the number itself.
// You are given a number 'n'.
// Find out whether 'n' is prime or not.

public class prime {
    public static void main(String[] args) {
        System.out.println(isPrime(23));
    }

    public static String isPrime(int num) {
        if (num == 1 || num == 2)
            return "NO";
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0)
               return "NO";
        }
        return "YES";
    }
}
