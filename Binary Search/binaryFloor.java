// Returns the index of the greatest number <= the given number
// That number is called as Floor number

public class binaryFloor {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 12, 34, 55, 78, 90 };
        System.out.println(binary(arr, 15));
    }

    static int binary(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (arr[start] > target)
            return -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }
}
