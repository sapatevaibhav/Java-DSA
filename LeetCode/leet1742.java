// You are working in a ball factory where you have n balls numbered from lowLimit up to highLimit inclusive (i.e., n == highLimit - lowLimit + 1), and an infinite number of boxes numbered from 1 to infinity.

// Your job at this factory is to put each ball in the box with a number equal to the sum of digits of the ball's number. For example, the ball number 321 will be put in the box number 3 + 2 + 1 = 6 and the ball number 10 will be put in the box number 1 + 0 = 1.

// Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.

public class leet1742 {
    public static void main(String[] args) {
        System.out.println(countBalls(19, 28));
    }

    public static int countBalls(int lowLimit, int highLimit) {
        int arr[] = new int[45];
        int max = -1;

        for (int i = lowLimit; i <= highLimit; i++) {
            arr[getTotalOfDigits(i)]++;
        }
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    private static int getTotalOfDigits(int i) {
        if (i < 10)
            return i;
        return (i % 10) + getTotalOfDigits(i / 10);
    }
}
