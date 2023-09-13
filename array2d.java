import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr={{1,2,3,4},{4,5,6,},{7,8},{9}};

        // for (int i = 0; i < arr.length; i++) {

        // System.out.println(Arrays.toString(arr[i]));
        // }

        int[][] arr2 = new int[3][3];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }

        }
        // for (int j = 0; j < arr2.length; j++) {

        //     System.out.println(Arrays.toString(arr2[j]));
        // }
        for (int[] is : arr2) {
            System.out.println(Arrays.toString(is));
        }
        sc.close();
    }
}
