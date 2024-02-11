package ArraysTest;


import Arrays.ArraySearcher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySearcherTest {

    @Test
    public void testLinearSearch() {
        int[] arr = {4, 6, 2, 8, 3, 7, 1};
        assertEquals(2, ArraySearcher.linearSearch(arr, 2));
    }

    @Test
    public void testLinearSearchNotFound() {
        int[] arr = {4, 6, 2, 8, 3, 7, 1};
        assertEquals(-1, ArraySearcher.linearSearch(arr, 5));
    }

    @Test
    public void testLinearSearchEmptyArray() {
        int[] arr = {};
        assertEquals(-1, ArraySearcher.linearSearch(arr, 5));
    }

    @Test
    public void testLinearSearchSingleElementArray() {
        int[] arr = {5};
        assertEquals(0, ArraySearcher.linearSearch(arr, 5));
    }
}
