// Given a non-negative integer num, return true if num can be expressed as the sum of any non-negative integer and its reverse, or false otherwise.
public class leet2443 {
    public static void main(String[] args) {
        System.out.println(sumOfNumberAndReverse(0));
    }

    public static boolean sumOfNumberAndReverse(int num) {
        for (int i = 0; i <= num; i++)
            if (i + reverseInt(i) == num)
                return true;
        return false;
    }

    public static int reverseInt(int input) {
        long reversedNum = 0;
        long input_long = input;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }
        return (int) reversedNum;
    }

}
