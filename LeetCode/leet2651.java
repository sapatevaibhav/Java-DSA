// You are given a positive integer arrivalTime denoting the arrival time of a train in hours, and another positive integer delayedTime denoting the amount of delay in hours. Return the time when the train will arrive at the station. Note that the time in this problem is in 24-hours format.

public class leet2651 {
    public static void main(String[] args) {
        System.out.println(findDelayedArrivalTime(13, 11));
    }

    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
