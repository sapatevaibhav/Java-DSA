// LeetCode question no 852
// We have to find the index in the given mountain array of peak element
// using binary search method

public class peakIndexInMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 150, 19, 8, 3 };
        System.out.println(peakIndexInMountainArray(arr));
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}
