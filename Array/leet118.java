// Given an integer numRows, return the first numRows of Pascal's triangle. In Pascal's triangle, each number is the sum of the two numbers directly above it ...

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            Integer[] temp = new Integer[i + 1];
            Arrays.fill(temp, 1);
            l.add(Arrays.asList(temp));
        }
        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j < l.get(i).size() - 1; j++) {
                l.get(i).set(j, l.get(i - 1).get(j - 1) + l.get(i - 1).get(j));
            }

        }
        return l;

    }
}
