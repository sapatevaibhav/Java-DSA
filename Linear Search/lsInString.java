// Search for the specific character in the String

public class lsInString {
    public static void main(String[] args) {
        System.out.println(LinearSearch("Vaibhav", 'i'));
    }

    private static int LinearSearch(String s, char c) {
        if (s.length() == 0)
            return -1;
        else
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == c)
                    return i;
        return -1;
    }
}
