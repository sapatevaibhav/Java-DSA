import java.util.Arrays;

class leet242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("car", "rat"));
    }

    static boolean isAnagram(String s, String t) {
        // s.split(").sort().join(");
        // t.split(").sort().join(");
        // if (s.equals(t)) {
        // return true;
        // } else
        // return false;
        // System.out.println(sa);
        if (s.length() != t.length())
            return false;
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        System.out.println(sa);
        System.out.println(ta);

        Arrays.sort(sa);
        Arrays.sort(ta);

        return Arrays.equals(sa,ta);
        // for (int i = 0; i < t.length(); i++) {
        // char sv = t.charAt(i);
        // if (s.contains(String.valueOf(sv))) {
        // } else {
        // return false;
        // }

        // }
        // return true;
    }
}