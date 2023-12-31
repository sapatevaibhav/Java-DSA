public class minMaxLinear {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 8, 9, 6, -2, -88 };
        minMax(arr);
    }

    static void minMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int a : arr) {
            if (a > max)
                max = a;
            if (a < min)
                min = a;
        }
        System.out.println("Min: " + min + " Max:" + max);
    }
}
