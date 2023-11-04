// You are given a 0-indexed 2D integer array nums representing the coordinates of the cars parking on a number line. For any index i, nums{i} = {starti, endi} where starti is the starting point of the ith car and endi is the ending point of the ith car. Return the number of integer points on the line that are covered with any part of a car.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leet2848 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(3, 6));
        list.add(Arrays.asList(1, 5));
        list.add(Arrays.asList(4, 7));
        System.out.println(numberOfPoints(list));
    };

    public static int numberOfPoints(List<List<Integer>> nums) {
        nums.sort(Comparator.comparing(list -> list.get(0)));

        int current = 0, numberOfPoints = 0;
        for (List<Integer> car : nums) {
            if (car.get(0) > current)
                numberOfPoints += car.get(1) - car.get(0) + 1;
            else if (car.get(1) > current)
                numberOfPoints += car.get(1) - current;

            current = Math.max(current, car.get(1));
        }

        return numberOfPoints;
    }
}
