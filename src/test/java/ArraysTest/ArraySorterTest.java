package ArraysTest;


import Arrays.ArraySorter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraySorterTest {

    @Test
    public void testQuickSort() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int[] expected = {5, 6, 7, 11, 12, 13};
        ArraySorter.quickSort(arr);
        assertArrayEquals(expected, arr);
    }

    // Add more test cases as needed
}
