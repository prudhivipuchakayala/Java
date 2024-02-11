package ArraysTest;

import Arrays.ArrayMinMax;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayMinMaxTest {

    @Test
    public void testFindSmallest() {
        int[] numbers = {5, 8, 3, 12, 9, 4, 6};
        int expected = 3;
        int actual = ArrayMinMax.findSmallest(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLargest() {
        int[] numbers = {5, 8, 3, 12, 9, 4, 6};
        int expected = 12;
        int actual = ArrayMinMax.findLargest(numbers);
        assertEquals(expected, actual);
    }
}
