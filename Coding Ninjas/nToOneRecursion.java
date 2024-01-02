// You are given an integer ‘n’.
// Your task is to return an array containing integers from ‘n’ to ‘1’ (in decreasing order) without using loops.
// In the output, you will see the array returned by you.

import java.util.Arrays;

public class nToOneRecursion {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNos(6)));
    }

    public static int[] printNos(int n) {
        if (n == 0) {
            return new int[0];
        } else {
            // Recursive case: generate the array for n-1 and append n at the beginning
            int[] smallerArray = printNos(n - 1);
            int[] newArray = new int[smallerArray.length + 1];
            newArray[0] = n;
            System.arraycopy(smallerArray, 0, newArray, 1, smallerArray.length);
            return newArray;
        }
    }
}