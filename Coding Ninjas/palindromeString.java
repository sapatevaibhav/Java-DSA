// Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.

public class palindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder original = new StringBuilder(str);
        return original.toString().equals(new StringBuilder(str).reverse().toString());
        // Write your code here.
    }
}