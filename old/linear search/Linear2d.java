import java.util.Arrays;

public class Linear2d {
    public static void main(String[] args) {
        int[][] arr = { { -1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 }, { 67, 44, 53, 3 } };
        linear(arr, 0);
        System.out.println(Arrays.toString(linear2(arr, 44)));
        System.out.println(Arrays.toString(minMax(arr)));

    }

    static void linear(int[][] arr, int target) {
        for (int[] is : arr) {
            for (int a : is) {
                if (a == target) {
                    System.out.println("Element bhetla bhencho");
                    System.exit(0);
                }
            }
        }
        System.out.println("Not found.");
    }

    static int[] linear2(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] minMax(int[][] arr) {
        int min = arr[1][1], max = arr[1][1];
        for (int[] is : arr) {
            for (int a : is) {
                if (a < min)
                    min = a;
                if (a > max)
                    max = a;
            }
        }
        return new int[] { min, max };
    }
}
