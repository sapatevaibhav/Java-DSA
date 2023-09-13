class rev {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(1534236469));
    }
    static int reverse(int x) {
        int rev = 0, r = 0;
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        } else if (x < 0) {
            x *= -1;
            r++;
        }
        while (x > 0) {
            int rem = x % 10;
            rev = rem + (rev * 10);
            x /= 10;
        }
        if (r != 0) {
            rev *= -1;
        }
        return rev;
    }
}