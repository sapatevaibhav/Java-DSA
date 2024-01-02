// Given an array 'arr' of size 'n'.
// Return an array with all the elements placed in reverse order.

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArrays(6, new int[] { 1, 2, 3, 4,7, 5 })));
    }

    public static int[] reverseArrays(int n, int[] nums) {
        // Write your code here.
        int[] reverse = new int[n];
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = nums[i];
        }
        return reverse;
    }
}
