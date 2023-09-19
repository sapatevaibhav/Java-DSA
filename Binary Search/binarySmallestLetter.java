// LeetCode question number 744
// Find the smallest letter which is greater than the target element provided
// NOTE : Letters wrap around

public class binarySmallestLetter {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        System.out.println(nextGreatestLetter(letters, 'f'));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start % letters.length];
    }
}
