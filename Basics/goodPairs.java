// Good pair is referred to the same valued elements in a pair

public class goodPairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[] { 1, 2,3 }));
    }

    static public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }
}