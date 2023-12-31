// The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

//     F(n) = F(n - 1) + F(n - 2), 
//     Where, F(1) = 1, F(2) = 1

// Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.

// "Indexing is start from 1"

import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] fibbo = new int[n];

        if (n > 0)
            fibbo[0] = 1;
        if (n > 1)
            fibbo[1] = 1;
        for (int i = 2; i < n; i++) {
            fibbo[i] = fibbo[i - 1] + fibbo[i - 2];
        }
        System.out.println(fibbo[n - 1]);
    }
}
