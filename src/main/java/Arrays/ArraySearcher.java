package Arrays;


public class ArraySearcher {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if target is found
            }
        }
        return -1; // Return -1 if target is not found in the array
    }
}
