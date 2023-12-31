// You are given a number ’n’.
// Find the number of digits of ‘n’ that evenly divide ‘n’.
// Note:
// A digit evenly divides ‘n’ if it leaves no remainder when dividing ‘n’

public class countDigits {
    public static void main(String[] args) {
        System.out.println(countDigitss(336));
    }

    public static int countDigitss(int n) {
        int count = 0;
        int temp = n;
        while (n != 0) {
            if (n % 10 != 0 && temp % (n % 10) == 0)
                count++;
            n /= 10;
        }

        return count;
    }
}