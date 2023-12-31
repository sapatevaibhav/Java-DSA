// Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.
// Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.

import java.util.Scanner;

public class sumOfEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int even = 0;
        int odd = 0;
        while (n != 0) {
            if ((n % 10) % 2 == 0)
                even += n % 10;
            else
                odd += n % 10;
            n /= 10;
        }
        System.out.println(even + " " + odd);
    }
}
