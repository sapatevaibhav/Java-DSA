/*
Adds first n natural numbers
Enter number: 4
10
 
*/

import java.util.Scanner;

public class addFirstN {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.close();

        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);
    }
}