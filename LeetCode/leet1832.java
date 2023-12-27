// A pangram is a sentence where every letter of the English alphabet appears at least once.

// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

public class leet1832 {

    public static void main(String[] args) {
        System.out.println(checkIfPangram("onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab"));
    }

    public static boolean checkIfPangram(String sentence) {
        for (int i = 97;i <= 122; i++) {
            if (sentence.indexOf((char)i) < 0) return false;
        }
        return true;
    }

}
