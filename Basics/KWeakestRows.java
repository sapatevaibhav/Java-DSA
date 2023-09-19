// Calculate sum of every subarray
// return the index of subarray who has smallest sum upto count n

// Half done by me shame on me

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KWeakestRows {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 }
        };
        System.out.println(Arrays.toString(kWeakestRows(arr, 3)));

    }

    static public int[] kWeakestRows(int[][] mat, int k) {
        int[] sum = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum[i] += mat[i][j];
            }
        }

        List<Integer> rowIndices = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            rowIndices.add(i);
        }
        Collections.sort(rowIndices, (a, b) -> {
            if (sum[a] == sum[b]) {
                return a - b;
            }
            return sum[a] - sum[b];
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowIndices.get(i);
        }
        return result;
    }
}
