// You are given an integer 'n'.

// Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.

// An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.

import java.util.Scanner;

public class armString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int res = 0,tr=n;
        int m = (String.valueOf(n).length());

        while (n != 0) {
            int temp = n % 10;
            res += Math.pow(temp, m);
            n /= 10;
        }
        System.out.println(res==tr);

    }
}
