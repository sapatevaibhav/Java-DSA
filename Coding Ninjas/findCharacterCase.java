//  Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
// 1, if the character is an uppercase alphabet (A - Z).
// 0, if the character is a lowercase alphabet (a - z).
// -1, if the character is not an alphabet.

import java.util.Scanner;

public class findCharacterCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int input = sc.next().charAt(0);
        int input ='9';
        System.out.println(input);
        sc.close();

        if (input >= 65 && input <= 90)
            System.out.println(1);
        else if (input >= 97 && input <= 122)
            System.out.println(0);
        else
            System.out.println(-1);

    }
}
