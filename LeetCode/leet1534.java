// Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.

// A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:

// 0 <= i < j < k < arr.length
// |arr[i] - arr[j]| <= a
// |arr[j] - arr[k]| <= b
// |arr[i] - arr[k]| <= c
// Where |x| denotes the absolute value of x.

// Return the number of good triplets.

public class leet1534 {

    public static void main(String[] args) {
        System.out.println(countGoodTriplets(new int[] { 1, 1, 2, 2, 3 }, 0, 0, 1));
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {

        int cnt = 0, n = arr.length;

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                for (int k = j + 1; k < n; k++)
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                            Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c) {
                        cnt += 1;
                    }

        return cnt;
    }

}