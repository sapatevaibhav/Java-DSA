public class removeEleme {
    public static void main(String[] args) {
        int[] arr = { 1 };

        System.out.println(removeElement(arr, 1));
    }

    // static int removeElement(int[] nums, int val) {
    // int j = nums.length - 1;
    // if (j == 0)
    // System.exit(0);
    // for (int i = 0; i < nums.length - 1; i++) {
    // if (i < j) {
    // if (nums[j] == val) {
    // j--;
    // }
    // if (nums[i] == val) {
    // int temp = nums[i];
    // nums[i] = nums[j];
    // nums[j] = temp;
    // j--;
    // }
    // }
    // }
    // return j + 1;
    // }

    // seems incorrect

    static int removeElement(int[] nums, int val) {
        int i = 0;
        for (final int num : nums)
            if (num != val)
                nums[i++] = num;
        return i;
    }
}
