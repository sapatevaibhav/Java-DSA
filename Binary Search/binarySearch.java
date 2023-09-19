public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 8, 10, 24, 56, 78, 90, 234, 566, 889 };
        System.out.println(binarys(arr, 5, 0, arr.length));
    }

    static int binarys(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
