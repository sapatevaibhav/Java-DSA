// Linear search that returns the index of thr element if it exists in the array else return -1

import java.util.Scanner;

public class ls_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elememnt to search: ");
        int target = sc.nextInt();
        sc.close();

        System.out.println(LinearSearch(new int[] { 1, 2, 3, 4, 5, 6, 7 }, target));
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        else
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
        return -1;
    }
}
