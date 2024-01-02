// You are given an integer ‘n’.
// Print “Coding Ninjas ” ‘n’ times, without using a loop.

import java.util.ArrayList;
import java.util.List;

public class printRecursion {
    public static void main(String[] args) {
        System.out.println(printNtimes(5));
    }

    public static List<String> printNtimes(int n) {
        if (n > 0) {
            List<String> smallerList = printNtimes(n - 1);
            smallerList.add("Coding Ninjas ");
            return smallerList;
        } else
            return new ArrayList<>();
    }
}
