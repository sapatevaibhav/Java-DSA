// We have given the Rotated Sorted array to find how many times the original array is rotated

public class RBSTimes {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 0, 1, 2, 3 };
        System.out.println("The original Array is rotated " + search(arr) + " times");
    }

    static int search(int[] nums) {

        return findPivot(nums) + 1;
    }

    static int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if (nums[start] >= nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
