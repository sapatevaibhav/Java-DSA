// You are given a 1-indexed integer array nums of length n. An element nums[i] of nums is called special if i divides n, i.e. n % i == 0. Return the sum of the squares of all special elements of nums.

public class leet2778 {
    public static void main(String[] args) {
        System.out.println(sumOfSquares(new int[] { 2, 7, 1, 19, 18, 3}));
    }

    public static int sumOfSquares(int[] nums) {
        int solution = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length % (i + 1) == 0) {
                solution = solution + (nums[i] * nums[i]);
            }
        }
        return solution;
    }
}
