// We have to find the square of every element in our array after finding square replace actual value by that square and then sort those values accordingly

import java.util.Arrays;

public class squaresOfArray {
    public static void main(String[] args) {
        int[] arr = { -7, -3, 2, 3, 11};
        System.out.println((Arrays.toString(sortedSquares(arr))));
    }

    static public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        return nums;
    }
}