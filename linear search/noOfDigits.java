// By using linear search iterate through an array and count the digits
// present in every number at end return how many numbers contains even 
// number of digits as well as odd too.

import java.util.Arrays;

public class noOfDigits {
    public static void main(String[] args) {
        int[] arr = { 1313, 33, -34, -644, 33223, 53435, 33, 0, 1, -9 };
        System.out.println(Arrays.toString(count(arr)));
    }

    static int[] count(int[] arr) {
        int even = 0, odd = 0;
        for (int i : arr) {
            if (i < 0)
                i = i * -1;
            boolean bool = evenOdd(String.valueOf(i));
            if (bool == true)
                even++;
            else
                odd++;

        }
        return new int[] { even, odd };
    }

    static boolean evenOdd(String cmp) {
        if (cmp.length() % 2 == 0)
            return true;
        else
            return false;
    }
}
