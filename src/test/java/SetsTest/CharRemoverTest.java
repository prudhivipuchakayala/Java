package SetsTest;



import Sets.CharRemover;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CharRemoverTest {

    @Test
    public void testRemoveDuplicates() {
        String input = "Hello World";
        String expectedOutput = "Helo Wrd";

        String actualOutput = CharRemover.removeDuplicates(input);

        assertEquals(expectedOutput, actualOutput);
    }
}
