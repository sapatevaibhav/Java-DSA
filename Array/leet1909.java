// Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.

// The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).

import java.util.Arrays;

public class leet1909 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 10, 5, 7 };
        System.out.println(canBeIncreasing(nums));
    }

    public static boolean canBeIncreasing(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            System.arraycopy(nums, i + 1, nums, i, nums.length - i - 1);
            System.out.println(Arrays.toString(nums));

        }
        return false;

    }
}