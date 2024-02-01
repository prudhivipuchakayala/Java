package AssignmentsAdditional;

public class ArraySumCalculator {

    public static int calculateArraySum(int[] array) {
        int sum = 0;

        for (int number : array) {
            sum += number;
        }

        return sum;
    }
}
