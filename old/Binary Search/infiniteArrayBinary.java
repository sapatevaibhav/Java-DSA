// Here we dont know the actual length of our array yet we have to find the index of the
// target element
// The approach used is start by taking start as 0 and end as 1 the length of array is 2 
// in next step double the chunk size where we are going to search the target element 
// and always check the condition for end is greater than target or not if not then proceed to next chunk else pass that chunk to the binaruy search

public class infiniteArrayBinary {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7, 8, 13, 45, 56, 78, 90, 234, 556, 789, 3567 };
        System.out.println(binary(arr, 234));
    }

    static int binary(int[] arr, int target) {
        int start = 0, end = 1;
        while (arr[end] < target) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            else if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
