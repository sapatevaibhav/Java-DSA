// You are given an array AA containing NN integers, and an integer KK (1≤K≤N1≤K≤N).
// Find the number of subarrays of AA with length KK whose bitwise OR is odd.

// Note: A subarray of AA is a contiguous segment of elements of AA.
// For example, if A=[1,3,2]A=[1,3,2], then it has 66 non-empty subarrays: [1],[3],[2],[1,3],[3,2],[1,3,2][1],[3],[2],[1,3],[3,2],[1,3,2].
// In particular, [1,2][1,2] is not a subarray of AA.

import java.util.Arrays;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int count = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            for (int j = 0; j + k - 1 < n; j++) {
                int sol = 0;
                for (int l = 0; l < k; l++) {
                    sol |= arr[j + l];
                }

                if (sol % 2 != 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
