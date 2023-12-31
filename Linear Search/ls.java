// Linear Search 

import java.util.Scanner;

public class ls {
    public static void main(String[] args) {
        System.out.print("Enter the number to search: ");
        // new scanner
        Scanner sc = new Scanner(System.in);
        // Tae the target element which want to search in the array
        int target = sc.nextInt();
        // close the scanner to avoid resource leak
        sc.close();
        // Calling the LinearSearch function by giving array and target element and
        // directly printing its output
        System.out.println(LinearSearch(new int[] { 10, 11, 22, 23, 44, 311, 3133, 31331 }, target));
    }

    // The function which performs searching linearly
    private static boolean LinearSearch(int[] arr, int target) {
        // If length of array is 0 then there is nothing in that array so return false
        if (arr.length == 0)
            return false;
        else
            // Iterate through array
            // This willl search in the array from the 0th index to last one
            for (int i : arr) {
                // If element is found return true
                if (i == target)
                    return true;

            }
        // Else return false as we searched entire array but the element not found
        return false;
    }
}
