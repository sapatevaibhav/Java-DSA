// In the array return the number of elements which has even number of digits

public class lsEvenDigits {
    public static void main(String[] args) {
        System.out.println(evenDigits(new int[] { 34, 432, 23, -235, 44, -22 }));
    }

    private static int evenDigits(int[] arr) {

        int count = 0; // COunt of the digits which have even numbers
        if (arr.length == 0) // If the provided array is empty then return -1
            return -1;
        else
            for (int j : arr) { // Fetch every element from the array
                boolean isEven = isEvendigit(j); // call the isEvenDIgit function to check if digits count is even or
                                                 // not
                if (isEven) // If yes then increase the value of count
                    count++;
            }
        return count; // Return the final count of even digit numbers
    }

    // The function which is used to count the number of digits in an int value
    private static boolean isEvendigit(int a) {
        int digits = 0; // Initially digit count 0
        while (a != 0) {// Continue this process until the number is not 0
            a /= 10; // Divide the number by 0
            digits++;// add 1 to digit count
        }
        return digits % 2 == 0; // return true if even number of digits present
    }
}