// Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

//     answer.length == nums.length.
//     answer[i] = |leftSum[i] - rightSum[i]|.

// Where:

//     leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
//     rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.

// Return the array answer.

public class leet2574 {
    public static void main(String[] args) {
        int arr[] = { 10, 4, 8, 3 };
        System.out.println(leftRightDifference(arr));
    }

    public static int[] leftRightDifference(int[] nums) {
        int left[] = new int[nums.length], right[] = new int[nums.length], sol[] = new int[nums.length];
        left[0] = 0;
        // leftsum
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        } // rightsum
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];

        }
        for (int j = 0; j < sol.length; j++) {
            sol[j] = Math.abs(left[j] - right[j]);
        }
        return sol;
    }
}
