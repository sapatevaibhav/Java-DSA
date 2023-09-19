import java.util.Arrays;

public class revArray {

    public static void main(String[] args) {
        int[] arr = { 22, 44, 56, 78, 3333, 4, 5, 4, 5 };
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rev(int arr[]) {
        int end = arr.length - 1;
        for (int start = 0; start < end; start++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }
    }
}