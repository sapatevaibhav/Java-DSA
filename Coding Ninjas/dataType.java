// Data type refers to the type of value a variable has and the way the computer interprets it.

// Each data type has a different size. You’ve studied 5 different data types and the sizes of the data types:

// Integer: 4 bytes
// Long: 8 bytes
// Float: 4 bytes
// Double: 8 bytes
// Character: 1 byte

// You’re given a data type. Print its size in bytes.
import java.util.Scanner;

public class dataType {
    public static int dataTypes(String type) {
        switch (type) {
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Integer":
                return 4;
            case "Double":
                return 8;
            case "Character":
                return 1;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a data type: ");
        String dataType = sc.next();
        sc.close();

        int size = dataTypes(dataType);

        if (size != -1) {
            System.out.println("Size of " + dataType + ": " + size + " bytes");
        } else {
            System.out.println("Invalid data type");
        }
    }
}
