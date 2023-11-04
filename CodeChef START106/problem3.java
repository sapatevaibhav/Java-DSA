// All of Chef's friends are playing fantasy cricket based upon the ODI World Cup, and Chef would like to join them.

// For a certain cricket match, Chef has decided upon his team of 1111 players. However, he hasn't yet decided who should be the captain and who should be the vice-captain.

// He's narrowed his decision down to NN players out of the 1111, from which he'll choose one to be the captain and one to be the vice captain.
// How many different choices does he have?

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(n * n - n);
        }
        sc.close();
    }
}
