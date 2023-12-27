public class leetcode1544 {
    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }

    public static String makeGood(String s) {
        String ret = s;

        while (true) {
            String newRet = getRet(ret);
            if (newRet.equals(ret)) {
                break;
            }
            ret = newRet;
        }

        return ret;
    }

    private static String getRet(String s) {
        int n = s.length();
        String ret = s;

        for (int i = 0; i < n - 1; i++) {
            int a = s.charAt(i) + 32;
            int b = s.charAt(i) - 32;
            int c = s.charAt(i + 1);

            if (c == a || c == b) {
                String sss = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1));
                ret = ret.replace(sss, "");
                i++;
            }
        }
        return ret;
    }

}
