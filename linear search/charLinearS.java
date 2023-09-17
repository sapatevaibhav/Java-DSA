public class charLinearS {
    public static void main(String[] args) {
        String s = "Vaibhav";
        System.out.println(linear(s, 's'));
        System.out.println(linear(s, 'V'));
    }

    static int linear(String s, char target) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }static boolean linear2(String s, char target) {
        for (char a: s.toCharArray()) {
            if (a == target) {
                return true;
            }
        }
        return false;
    }
}
