// You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.

// There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.

// For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
// For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).

// Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.

public class leet1844 {

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1b2c3d4e"));
    }

    public static String replaceDigits(String s) {
        int len = s.length();
        StringBuilder ret = new StringBuilder();
        for (int i = 1; i < len; i += 2) {
            ret.append(s.charAt(i - 1));
            ret.append((char) (s.charAt(i - 1) + s.charAt(i) - '0'));
        }
        if (len % 2 != 0) {
            ret.append(s.charAt(len - 1));

        }
        return String.valueOf(ret);
    }
}
