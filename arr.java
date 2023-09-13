import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        System.out.print("Enter the length of Array: ");

        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        String str[]=new String[a];

        sc.close();

        for(int i=0;i<a;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
