package Arrays;


public class ArrayZeroMover {
    public static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        // Move all non-zero elements to the beginning of the array
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex++] = num;
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }
}
