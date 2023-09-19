// Sort all the elements in ascending order and make record of how many of them were not properly organized in default array.

import java.util.Arrays;

public class heightChecker {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightCheck(arr));
    }

    static public int heightCheck(int[] heights) {
        int diff = 0;
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights, 0, heights.length);
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != heights[i])
                diff++;

        return diff;
    }
}