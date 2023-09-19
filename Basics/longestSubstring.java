public class longestSubstring {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static public int lengthOfLongestSubstring(String s) {
        String sub = "";
        String sub2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (sub2.contains(String.valueOf(s.charAt(i)))) {
                if (sub2.length() > sub.length()) {
                    sub = sub2;
                    sub2 = String.valueOf(s.charAt(i));
                    // sub2 += ;
                } else {
                    sub2 = String.valueOf(s.charAt(i));
                }
            } else {
                sub2 += s.charAt(i);

            }
        }
        if (sub2.length() > sub.length())
            sub = sub2;
        System.out.println(sub);
        return sub.length();
    }

}