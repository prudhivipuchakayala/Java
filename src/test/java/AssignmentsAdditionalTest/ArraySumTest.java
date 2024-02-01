package AssignmentsAdditionalTest;

import AssignmentsAdditional.ArraySumCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySumTest {

    @Test
    public void testCalculateArraySum() {
        int[] numbers = {1, 2, 3, 4, 5};

        int sum = ArraySumCalculator.calculateArraySum(numbers);

        assertEquals(15, sum);
    }
}
