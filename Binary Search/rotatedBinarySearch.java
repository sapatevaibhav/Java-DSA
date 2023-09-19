// We have given the Rotated Sorted array to find the target element in it by using Binary 
// First we have to search for the pivot element in it by using 4 cases after that pass the array to binary search by accordingly manner.

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 66));

    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1)
            return binarySearch(nums, target, 0, nums.length - 1);
        if (nums[pivot] == target)
            return pivot;
        if (target >= nums[0])
            return binarySearch(nums, target, 0, pivot - 1);

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
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

/*
 * Added Recursion
 * 
 * 
 * 
 * 
 * class Solution {
 * public int search(int[] nums, int target) {
 * int pivot = findPivot(nums, 0, nums.length - 1);
 * if (pivot == -1)
 * return binarySearch(nums, target, 0, nums.length - 1);
 * else if (nums[pivot] == target)
 * return pivot;
 * else if (target >= nums[0])
 * return binarySearch(nums, target, 0, pivot - 1);
 * else
 * return binarySearch(nums, target, pivot + 1, nums.length - 1);
 * }
 * 
 * private static int binarySearch(int[] nums, int target, int start, int end) {
 * if (start <= end) {
 * int mid = start + (end - start) / 2;
 * if (nums[mid] == target)
 * return mid;
 * else if (nums[mid] > target)
 * return binarySearch(nums, target, start, mid - 1);
 * else
 * return binarySearch(nums, target, mid + 1, end);
 * }
 * return -1;
 * }
 * 
 * static int findPivot(int[] nums, int start, int end) {
 * if (start <= end) {
 * int mid = start + (end - start) / 2;
 * if (mid < end && nums[mid] > nums[mid + 1])
 * return mid;
 * else if (mid > start && nums[mid] < nums[mid - 1])
 * return mid - 1;
 * else if (nums[start] >= nums[mid])
 * return findPivot(nums, start, mid - 1);
 * else
 * return findPivot(nums, mid + 1, end);
 * }
 * return -1;
 * }
 * }
 * 
 */