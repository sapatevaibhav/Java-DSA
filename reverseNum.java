/*

Enter the number: 4232
reversed no is: 2324

*/

import java.util.*;

public class reverseNum {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(),sum=0;
        sc.close();

        while(i>0){
            int rem=i%10;
            sum=rem+(10*sum);
            i=i/10;
        }
        System.out.println("reversed no is: "+sum);
    }
}
