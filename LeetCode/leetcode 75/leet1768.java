//  You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.

public class leet1768 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        String ret = ""; // Use StringBuilder and while loop for faster approach
        for (int i = 0, j = 0; i < word1.length() || j < word2.length(); i++, j++) {
            if (i < word1.length()) {
                ret += (word1.charAt(i));
            }
            if (j < word2.length()) {
                ret += (word2.charAt(j));
            }
        }
        return ret;
    }
}
