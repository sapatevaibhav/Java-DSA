//returns index of element if found
//else returns -1

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = { 10, 49, 502, 294, 596, 3353, 53553, 33, 543, 54, 333, 564, 667, 4464, 76, 335, 88, 75, 757, 86865,
                655, 677, 6465757, 57774675, 777, 577, 7577, 556, 77686, 757 };
        System.out.println(linear(arr, 353));
    }

    static boolean linear(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i : arr) {
            if (i == target)
                return true;
        }
        return false;
    }
}
