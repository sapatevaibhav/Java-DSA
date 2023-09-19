public class distanceBetweenBusStops {
    public static void main(String[] args) {
        int arr[] = { 7, 10, 1, 12, 11, 14, 5, 0 };
        System.out.println(distanceBetweenBusStop(arr, 2, 7));
    }

   static public int distanceBetweenBusStop(int[] distance, int start, int destination) {
    int totalDistance = 0;
    int clockwiseDistance = 0;
    int n = distance.length;

    // Calculate the total distance
    for (int i = 0; i < n; i++) {
        totalDistance += distance[i];
    }

    // Calculate the clockwise distance from start to destination
    for (int i = start; i != destination; i = (i + 1) % n) {
        clockwiseDistance += distance[i];
    }

    // Calculate the counterclockwise distance
    int counterclockwiseDistance = totalDistance - clockwiseDistance;

    // Return the minimum of clockwise and counterclockwise distances
    return Math.min(clockwiseDistance, counterclockwiseDistance);
}}
