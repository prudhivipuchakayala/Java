package AssignmentsAdditionalTest;

import AssignmentsAdditional.SwapIntegers;
import org.junit.Test;
import static org.junit.Assert.*;

public class SwapIntegersTest {

    @Test
    public void testSwapIntegers() {
        int[] values = {5, 10};

        SwapIntegers.swapIntegers(values);

        assertEquals(10, values[0]);
        assertEquals(5, values[1]);
    }
}
