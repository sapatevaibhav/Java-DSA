
public class reverse32Bits {
    public static void main(String[] args) {

        long signedInt = 6;
        System.out.println(reverseBits(signedInt));
    }

    public static long reverseBits(long n) {
        long unsignedLong = n & 0xFFFFFFFFL;

        StringBuilder binaryStringBuilder = new StringBuilder(Long.toBinaryString(unsignedLong));

        // Ensure the string is 32 bits by adding leading zeros if necessary
        while (binaryStringBuilder.length() < 32) {
            binaryStringBuilder.insert(0, '0');
        }

        String reversedBinaryString = binaryStringBuilder.reverse().toString();

        // Convert the reversed binary string back to long
        long reversed = Long.parseLong(reversedBinaryString, 2);

        return reversed;
    }
}
