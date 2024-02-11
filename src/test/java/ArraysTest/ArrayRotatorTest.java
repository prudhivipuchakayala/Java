package ArraysTest;


import Arrays.ArrayRotator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayRotatorTest {

    @Test
    public void testRotateLeft() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {3, 4, 5, 6, 7, 1, 2};
        ArrayRotator.rotateLeft(arr, 2);
        assertArrayEquals(expected, arr);
    }

}

