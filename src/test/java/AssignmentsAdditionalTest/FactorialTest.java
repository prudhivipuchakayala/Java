package AssignmentsAdditionalTest;

import AssignmentsAdditional.Factorial;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testCalculateFactorial() {
        assertEquals(1, Factorial.calculateFactorial(1));
        assertEquals(120, Factorial.calculateFactorial(5));
    }
}
