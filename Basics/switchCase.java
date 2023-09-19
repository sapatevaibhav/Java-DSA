import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.print("Enter the no of day: ");
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        sc.close();

        switch (no) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Day entered is incorrect");
        }
    }
}
