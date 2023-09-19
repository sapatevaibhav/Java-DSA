// Find the number which is repeated if multiple return 1
// copied from internet i am not getting any idea what's going here


public class duplicateNumber {
    public static void main(String[] args) {
        int[] arr = { 63366, 27019, 83028, 34703, 32585, 1626, 87969, 35936, 48589, 33878, 70774, 24731, 48063, 29389,
                17621, 27431, 79765, 72149, 94086, 38570, 71143, 47047, 11096, 36587, 34086, 21639, 71437, 5472, 95582,
                13510, 30638, 65724, 7250, 28004, 86306, 51760, 85566, 66466, 17867, 62211, 71811, 61291, 70193, 62483,
                78819, 62367, 99487, 11330, 68173, 96445, 5742, 23122, 92640, 67511, 15860, 34328, 1469, 60877, 25790,
                15312, 678186875, 20736, 80984, 28958, 71074, 75106, 80121, 18794, 86003, 60054, 54957, 67925, 45863,
                72180, 85, 3797, 41075, 54284, 82652, 86621, 49203, 45911, 21557, 54530, 91128, 79324, 71930, 17620,
                92339, 17983, 74643, 76583, 23808, 46469, 29359, 63366, 33207, 52500, 61218, 59835, 75564, 24159, 79974,
                53946, 90154, 57330, 84219, 54290, 72204, 52235 };
        System.out.println(findDuplicate(arr));
    }

    static public int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];

        // Phase 1: Find the intersection point in the cycle
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }

        // Phase 2: Find the entrance to the cycle
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }
}