package Arrays;


public class ArrayRotator {
    public static void rotateLeft(int[] arr, int positions) {
        int n = arr.length;
        positions = positions % n; // Normalize positions if greater than array length

        // Reverse the elements from 0 to positions-1
        reverse(arr, 0, positions - 1);
        // Reverse the elements from positions to n-1
        reverse(arr, positions, n - 1);
        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
