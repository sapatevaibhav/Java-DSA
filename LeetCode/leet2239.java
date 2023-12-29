//  Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.

public class leet2239 {
    public static void main(String[] args) {
        System.out.println(findClosestNumber(new int[] { -10, 10, 10 }));
    }

    public static int findClosestNumber(int[] nums) {
        int closestValue = Math.abs(nums[0]);
        int closestNumber = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int currVal = Math.abs(nums[i]);
            if (currVal < closestValue || (closestValue == currVal && nums[i] > closestNumber)) {
                closestNumber = nums[i];
                closestValue = currVal;
            }

        }
        return closestNumber;
    }
}
