// You are given a 0-indexed integer array nums. A subarray s of length m is called alternating if:

// m is greater than 1.
// s1 = s0 + 1.
// The 0-indexed subarray s looks like [s0, s1, s0, s1,...,s(m-1) % 2]. In other words, s1 - s0 = 1, s2 - s1 = -1, s3 - s2 = 1, s4 - s3 = -1, and so on up to s[m - 1] - s[m - 2] = (-1)m.

// Return the maximum length of all alternating subarrays present in nums or -1 if no such subarray exists. A subarray is a contiguous non-empty sequence of elements within an array.

public class leet2765 {
    public static void main(String[] args) {
        System.out.println(alternatingSubarray(new int[] { 2, 3, 4, 3, 4 }));
    }

    public static int alternatingSubarray(int[] nums) {
        int ans = 0, i = 0, temp = 0;
        boolean a = false;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1 && a == false) {
                temp++;
                a = true;
            } else if (nums[i + 1] - nums[i] == -1 && a == true) {
                temp++;
                a = false;
            } else {
                ans = Math.max(ans, temp);
                temp = 0;
                if (nums[i + 1] - nums[i] == 1) {
                    temp++;
                    a = true;
                } else {
                    a = false;
                }
            }
        }
        ans = Math.max(ans, temp);
        return (ans > 0 ? ans + 1 : -1);
    }
}
