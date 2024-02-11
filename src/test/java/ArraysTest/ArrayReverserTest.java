package ArraysTest;


import Arrays.ArrayReverser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayReverserTest {

    @Test
    public void testReverseArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        ArrayReverser.reverse(arr);
        assertArrayEquals(expected, arr);
    }
    @Test
    public void testReverseEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        ArrayReverser.reverse(arr);
        assertArrayEquals(expected, arr);
    }
}
