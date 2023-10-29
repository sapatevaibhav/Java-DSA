public class romantoint {
    public static void main(String[] args) {

        String x = "IIIX";
        int ret = 0;

        for (int i = 0; i < x.length(); i++) {
            if (i < x.length() - 1) {
                if (x.charAt(i) == 'I' && (x.charAt(i + 1) == 'V' || x.charAt(i + 1) == 'X')) {
                    ret -= 2;
                } else if (x.charAt(i) == 'X' && (x.charAt(i + 1) == 'L' || x.charAt(i + 1) == 'C')) {
                    ret -= 20;
                } else if (x.charAt(i) == 'C' && (x.charAt(i + 1) == 'D' || x.charAt(i + 1) == 'M')) {
                    ret -= 200;
                }
            }
            switch (x.charAt(i)) {
                case 'I':
                    ret += 1;
                    break;
                case 'V':
                    ret += 5;
                    break;
                case 'X':
                    ret += 10;
                    break;
                case 'L':
                    ret += 50;
                    break;
                case 'C':
                    ret += 100;
                    break;
                case 'D':
                    ret += 500;
                    break;
                case 'M':
                    ret += 1000;
                    break;
                default:
                    System.exit(0);

            }
        }
        System.out.println(ret);
    }
}