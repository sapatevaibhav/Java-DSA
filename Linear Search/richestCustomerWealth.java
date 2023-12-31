// leetcode 1672

/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has. A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 */
public class richestCustomerWealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] { { 1, 5, 7 }, { 7, 3 }, { 3, 5 } }));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum[] = new int[accounts.length];
        for (int j = 0; j < sum.length; j++) {
            for (int i = 0; i < accounts[j].length; i++) {
                sum[j] += accounts[j][i];
            }
            if (max < sum[j])
                max = sum[j];
        }
        return max;
    }
}
