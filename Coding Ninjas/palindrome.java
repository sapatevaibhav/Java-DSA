// Check whether a given number ’n’ is a palindrome number.

// Note :
// Palindrome numbers are the numbers that don't change when reversed.
// You don’t need to print anything. Just implement the given function.

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindromeNumber(51415));
    }

    public static boolean palindromeNumber(int n) {
        StringBuilder s = new StringBuilder(Integer.toString(n)).reverse();
        return Integer.parseInt(s.toString()) == n;
    }
}
