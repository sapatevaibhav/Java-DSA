import java.util.Arrays;

public class removeDupli {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };

        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int removeDuplicates(int[] nums) {
        boolean zero = nums[0] == 0;
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int k = i + 1; k < nums.length-1; k++) {
                if (nums[i] == nums[k]) {
                    nums[i] = 0;
                    count++;

                }

            }
        }
        int i;
        if (zero) {
            i = 1;
        } else {
            i = 0;
        }
        for (; i < nums.length-1 ; i++) {
            int k = i ;
            while (k < nums.length ) {
                if (nums[i] == 0 && nums[k] != 0) {
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                    k+=1;
                } else {
                    k++;
                }
            }
        }
        return count;
    }
}