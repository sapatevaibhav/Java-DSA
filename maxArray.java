public class maxArray {
    public static void main(String[] args) {
        int[] arr = { 462, 32, 43, 54,- 3332, 6776, 29, 28, 00, -11 };
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int max(int[] arr) {
        int mx = arr[0];
        for (int i : arr)
            if (mx < i)
                mx = i;
        return mx;
    }

    static int min(int[] arr) {
        int mx = arr[0];
        for (int i : arr)
            if (mx > i)
                mx = i;
        return mx;
    }
}
