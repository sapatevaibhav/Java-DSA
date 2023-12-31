// Find min and max using the LinearSearch in an array

public class lsMinMax {
    public static void main(String[] args) {
        int[] result = minMax(new int[] { 34, 432, 23, 32 - 235 });
        if (result.length != 0)
            System.out.println("Min: " + result[0] + "\nMax: " + result[1]);
    }

    private static int[] minMax(int[] arr) {

        if (arr.length == 0)
            return new int[] {};
        else {
            int min = arr[0], max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min)
                    min = arr[i];
                if (arr[i] > max)
                    max = arr[i];
            }
            return new int[] { min, max };
        }
    }
}
