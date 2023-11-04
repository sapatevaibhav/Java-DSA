// You are given a string num representing a large integer. An integer is good if it meets the following conditions:

//     It is a substring of num with length 3.
//     It consists of only one unique digit.

// Return the maximum good integer as a string or an empty string "" if no such integer exists.

public class leet2264 {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("42352338"));
    }

    public static String largestGoodInteger(String num) {
        String s = "";
        for (int i = 0; i < num.length() - 2; i++) {

            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                String temp = new StringBuilder().append(num.charAt(i)).append(num.charAt(i)).append(num.charAt(i))
                        .toString();
                if (s == "" || num.charAt(i) > s.charAt(0))
                    s = temp;
            }
        }
        return s;
    }
}
