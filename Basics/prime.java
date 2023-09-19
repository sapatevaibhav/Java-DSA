/*

Enter number: 23
Number is Prime.

*/

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n, div = 2;
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.close();

        if (n == 1) {
            System.out.println("Number is not Prime.");
            System.exit(0);
        }
        
        while (div < n) {
            if (n % div == 0) {
                System.out.println("Number is not Prime.");
                System.exit(0);
            } else {
                div++;
            }
        }
        System.out.println("Number is Prime.");
    }
}