/*

Enter the number: 12321
The number is palindrome.

*/

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        sc.close();

        int sum = 0, c = x, rem = 0;
        while (x > 0) {
            rem = x % 10;
            sum = rem + (sum * 10);
            x = x / 10;
        }
        if (sum == c) {
            System.out.println("The number is palindrome.");
        } else {
            System.out.println("The number is not palindrome.");
        }
    }
}