// Here using linear search but in the specified range only

public class lsInRange {

    public static void main(String[] args) {

        System.out.println(LinearSearch(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5, 2, 3));
    }

    static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0)
            return -1;
        else
            for (int i = start; i < end; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
        return -1;
    }
}
