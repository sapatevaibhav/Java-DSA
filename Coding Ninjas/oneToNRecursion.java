import java.util.Arrays;

public class oneToNRecursion {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNos(5)));
    }

    static int i = 0;

    public static int[] printNos(int n) {
        if (n <= 0) {
            return new int[0]; // Base case: return an empty array for non-positive input
        } else {
            int[] smallerArray = printNos(n - 1);
            int[] newArray = new int[n];
            System.arraycopy(smallerArray, 0, newArray, 0, n - 1);
            newArray[n - 1] = n;
            return newArray;
        }
    }
    // private static int recursion(int x){
    // return 0;
    // }
}
