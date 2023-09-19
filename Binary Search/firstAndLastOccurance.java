// LeetCode question number 34
// Find the first occurance and last occurance of the target in an array by using Binary search

import java.util.Arrays;

public class firstAndLastOccurance {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 7, 7, 8, 8, 10 };
        System.out.println(Arrays.toString(searchRange(nums, 8)));
        // output must be [5,6]
    }

    static int[] searchRange(int[] nums, int target) {
        int[] occurances = { -1, -1 }; // our final output will be stored here
        occurances[0] = exactLocation(nums, target, true);
        occurances[1] = exactLocation(nums, target, false);
        return occurances;
    }

    static int exactLocation(int[] nums, int target, boolean b) {
        // this function returns the indexes of first and the last occurances of the
        // target
        int ans = -1, start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                ans = mid;
                if (b)
                    // if we are searching to left side
                    end = mid - 1;
                else
                    // if we are searching to right side
                    start = mid + 1;

            }
        }
        return ans;
    }
}
