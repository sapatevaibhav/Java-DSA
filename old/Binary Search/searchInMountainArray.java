// Here we have to search an element in the Mountain array to do this simple logic is applied
// Find the peak element and divide the array in 2 parts fro that peak element 
// Apply binary search in the left part of that peak element if target element found return it's index else try to search for it in Right subarray.

public class searchInMountainArray {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findInMountainArray(1, nums));
    }

    static int findInMountainArray(int target, int[] nums) {
        int peak = findPeakElement(nums);
        int firstTry = binarySearch(nums, target, 0, peak);
        if (firstTry != -1)
            return firstTry;
        else
            return binarySearch(nums, target, peak + 1, nums.length - 1);
    }

    static int findPeakElement(int[] mountainArr) {
        int start = 0, end = mountainArr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid + 1])
                end = mid;
            else
                start = mid + 1;

        }
        return start;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        if (nums[start] < nums[end])
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target)
                    return mid;
                else if (nums[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        else
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target)
                    return mid;
                else if (nums[mid] < target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        return -1;
    }

}

/*
 * 
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 * 
 * 
 * class Solution {
 * public int findInMountainArray(int target, MountainArray mountainArr) {
 * int peak = findPeakElement(mountainArr);
 * int firstTry = binarySearch(mountainArr, target, 0, peak);
 * if (firstTry != -1) {
 * return firstTry;
 * } else {
 * return binarySearchReverse(mountainArr, target, peak + 1,
 * mountainArr.length() - 1);
 * }
 * }
 * 
 * static int findPeakElement(MountainArray mountainArr) {
 * int start = 0, end = mountainArr.length() - 1;
 * while (start < end) {
 * int mid = start + (end - start) / 2;
 * if (mountainArr.get(mid) > mountainArr.get(mid + 1))
 * end = mid;
 * else
 * start = mid + 1;
 * }
 * return start;
 * }
 * 
 * static int binarySearch(MountainArray nums, int target, int start, int end) {
 * while (start <= end) {
 * int mid = start + (end - start) / 2;
 * int midVal = nums.get(mid);
 * if (midVal == target) {
 * return mid;
 * } else if (midVal < target) {
 * start = mid + 1;
 * } else {
 * end = mid - 1;
 * }
 * }
 * return -1;
 * }
 * 
 * static int binarySearchReverse(MountainArray nums, int target, int start, int
 * end) {
 * while (start <= end) {
 * int mid = start + (end - start) / 2;
 * int midVal = nums.get(mid);
 * if (midVal == target) {
 * return mid;
 * } else if (midVal > target) {
 * start = mid + 1;
 * } else {
 * end = mid - 1;
 * }
 * }
 * return -1;
 * }
 * }
 * 
 * 
 * 
 */
