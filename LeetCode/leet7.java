// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

public class leet7 {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        int neg = 0;
        if (x == Integer.MIN_VALUE) {
            return 0; // Reversing Integer.MIN_VALUE will overflow
        }
        if (x < 0) {
            x *= -1;
            neg++;
        }
        System.out.println(x);
        StringBuilder s = new StringBuilder(Integer.toString(x)).reverse();
        if (Long.parseLong(s.toString()) > Integer.MAX_VALUE)
            return 0;
        x = Integer.parseInt(s.toString());
        if (neg == 1)
            return x * -1;
        return x;
    }
}
