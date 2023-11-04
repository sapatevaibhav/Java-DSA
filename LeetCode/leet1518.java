// There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle. The operation of drinking a full water bottle turns it into an empty bottle. Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

public class leet1518 {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int remain = numBottles;
        int total = numBottles;
        while (remain >= numExchange) {
            int exchanged = remain / numExchange;
            total += exchanged;
            remain = exchanged + (remain % numExchange);
        }
        return total;
    }
}
