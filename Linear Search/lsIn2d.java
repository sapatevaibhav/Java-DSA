// Searching the element in the 2 dimentional array

import java.util.Arrays;

public class lsIn2d {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(LinearSearch(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, 50)));
    }

    private static int[] LinearSearch(int[][] arr, int target) {
        if (arr.length == 0)
            return new int[] {};
        else
            for (int i = 0; i < arr.length; i++)
                for (int j = 0; j < arr[i].length; j++)
                    if (arr[i][j] == target)
                        return new int[] { i, j };
        return new int[] {};
    }
}
