public class firstOccurrence {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(strStr(s, "leeto"));
    }

    static int strStr(String haystack, String needle) {
        int index = -1;
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return index;
    }
}