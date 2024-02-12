package AssignmentsAdditionalTest;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import AssignmentsAdditional.RepeatedChars;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RepeatedCharsTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testPrintRepeatedChars() {
        String input = "hello world";
        String expectedOutput = "Character 'l' is repeated 3 times.\n" +
                "Character 'o' is repeated 2 times.";

        RepeatedChars.printRepeatedChars(input);

        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
