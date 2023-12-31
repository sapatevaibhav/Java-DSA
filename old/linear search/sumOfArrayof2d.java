// We are taking the 2-dimentional array as an input and returning the
// addition of each array in it seperately

public class sumOfArrayof2d {
    public static void main(String[] args) {
        int[][] arr = { { 29, 4, 32 }, { 3, 1, 4 }, { 4, 6 }, { 5, 4 }, { 5, 7 }, { 8, 0 } };
        makeTheSum(arr);
    }

    static void makeTheSum(int[][] arr) {
        for (int[] i : arr) {
            int a = 0;
            for (int j : i) {
                a += j;
            }
            System.out.println(a);
        }
    }
}
