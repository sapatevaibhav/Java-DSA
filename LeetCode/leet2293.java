// You are given a 0-indexed integer array nums whose length is a power of 2.

// Apply the following algorithm on nums:

//     Let n be the length of nums. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n / 2.
//     For every even index i where 0 <= i < n / 2, assign the value of newNums[i] as min(nums[2 * i], nums[2 * i + 1]).
//     For every odd index i where 0 <= i < n / 2, assign the value of newNums[i] as max(nums[2 * i], nums[2 * i + 1]).
//     Replace the array nums with newNums.
//     Repeat the entire process starting from step 1.

// Return the last number that remains in nums after applying the algorithm.

public class leet2293 {
    public static void main(String[] args) {
        System.out.println(minMaxGame(new int[] { 70, 38, 21, 22 }));
    }

    public static int minMaxGame(int[] nums) {
        int[] newNums = new int[nums.length / 2];
        if (nums.length == 1)
            return nums[0];
        for (int i = 0; i < nums.length / 2; i++) {
            if (i % 2 == 0) {
                newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            } else if (i % 2 == 1) {
                newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            } else {
                return nums[0];
            }
        }
        return minMaxGame(newNums);
    }
}