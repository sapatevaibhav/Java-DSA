// Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.

// After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.

public class leet1837 {
    public static void main(String[] args) {
        System.out.println(sumBase(34, 6));
    }

    public static int sumBase(int n, int k) {
            int ret = 0;

            while (n > 0) {
                ret += n % k; 
                n /= k;
            }

            return ret;
        }
}