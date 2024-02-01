package AssignmentsAdditional;

public class SwapIntegers {

    public static void swapIntegers(int[] arr) {
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
    }
}
