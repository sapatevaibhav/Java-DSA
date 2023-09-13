import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter columns: ");
        int col = sc.nextInt();
        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                list.get(j).add(sc.nextInt());
            }
        }
        System.out.println(list);
        sc.close();
    }
}
