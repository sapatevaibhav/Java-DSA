import java.util.Arrays;

public class descending {
    public static void main(String[] args) {

        int[] nums = { 5, 2, 9, 1, 5, 6 };
        int val = 5;
        int newLength = removeElement(nums, val);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        Arrays.sort(nums, 0, k);
        for (int i = 0; i < k / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = temp;
        }

        return k;
    }
}
