public class rangeLinear {
    public static void main(String[] args) {
        int[] arr = { 23244, 16, 45, 334, 67, 5, 44, 34, 5, 26, 5, 36, 5, 6 };
        System.out.println(linear(arr, 6, 0, 6));
    }

    static boolean linear(int[] arr, int target, int start, int end) {
        if(start>arr.length||end>arr.length)
            return false;
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
