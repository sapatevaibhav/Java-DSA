// You are given an integer array  'ARR' of size 'N' and an integer 'S'. Your task is to return the list of all pairs of elements such that each sum of elements of each pair equals 's'

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pairSum {
    public static void main(String[] args) {
        int arr[] = { 2, -6, 2, 5, 2 };
        int s = 4;

        List<int[]> result = pairsSum(arr, s);
        for (int[] pair : result) {
            System.out.println(pair[0] + " + " + pair[1] + " = " + s);
        }
    }

    public static List<int[]> pairsSum(int[] arr, int s) {
        List<int[]> outp = new ArrayList<int[]>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s) {
                    int[] pair = { arr[i], arr[j] };
                    Arrays.sort(pair);
                    outp.add(pair);
                }
            }
        }
        return outp;
    }
}