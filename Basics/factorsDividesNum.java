public class factorsDividesNum {
    public static void main(String[] args) {
        System.out.println(countFactors(2));
    }

    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
