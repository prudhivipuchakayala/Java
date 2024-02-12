package AssignmentsAdditionalTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import AssignmentsAdditional.Repeat;
import org.junit.Test;

public class RepeatTest {

    @Test
    public void testFindRepeated() {
        int number = 1122334455;
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, Repeat.findRepeated(number));
    }

    @Test
    public void testFindRepeatedWithNoRepeatedDigits() {
        int number = 12345;
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, Repeat.findRepeated(number));
    }

    @Test
    public void testFindRepeatedWithAllRepeatedDigits() {
        int number = 999999;
        List<Integer> expected = Arrays.asList(9);
        assertEquals(expected, Repeat.findRepeated(number));
    }
}
