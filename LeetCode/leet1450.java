// Given two integer arrays startTime and endTime and given an integer queryTime.

// The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].

// Return the number of students doing their homework at time queryTime. More formally, return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.

public class leet1450 {
    public static void main(String[] args) {
        System.out.println(busyStudent(new int[] { 1, 2, 3 }, new int[] { 3, 2, 7 }, 4));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < endTime.length; i++) {
            for (int j = startTime[i]; j <= endTime[i]; j++) {
                if (j == queryTime) {
                    count++;
                }
            }
        }
        // for (int i = 0; i < startTime.length; i++) {
        // if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
        // count++;
        // }
        // }
        return count;
    }
}
