package ArraysTest;


import Arrays.ArrayZeroMover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayZeroMoverTest {

    @Test
    public void testMoveZerosToEnd() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        ArrayZeroMover.moveZerosToEnd(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testMoveZerosToEndWithZerosAtEnd() {
        int[] nums = {1, 2, 0, 0, 0};
        int[] expected = {1, 2, 0, 0, 0};
        ArrayZeroMover.moveZerosToEnd(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testMoveZerosToEndWithAllZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0};
        ArrayZeroMover.moveZerosToEnd(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testMoveZerosToEndWithNoZeros() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        ArrayZeroMover.moveZerosToEnd(nums);
        assertArrayEquals(expected, nums);
    }
}
