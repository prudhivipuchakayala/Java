package MapsTest;




import Maps.DistinctCharacterCounter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DistinctCharacterCounterTest {

    @Test
    public void testCountDistinctCharacters() {
        String input = "test string";
        String expectedOutput = "t-3, e-1, s-2, r-1, i-1, n-1, g-1";

        String actualOutput = DistinctCharacterCounter.countDistinctCharacters(input);

        assertEquals(expectedOutput, actualOutput);
    }
}
