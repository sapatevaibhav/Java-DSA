public class binaryAscDesc {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 8, 10, 24, 56, 78, 90, 234, 566, 889 };
        int[] arr1 = { 903, 889, 566, 234, 90, 78, 56, 24 };
        System.out.println(binarySearch(arr, 78, 0, arr.length - 1));
        System.out.println(binarySearch(arr1, 78, 0, arr1.length - 1));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (arr[start] < arr[end]) {
            System.out.println("Asc");
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target)
                    return mid;
                else if (arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        } else {
            System.out.println("Desc");
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target)
                    return mid;
                else if (arr[mid] > target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
