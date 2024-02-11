package Strings;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WordReverserTest {

    @Test
    public void testReverseWords() {
        assertEquals("avaJ EE2J esreveR eM", WordReverser.reverseWords("Java J2EE Reverse Me"));
        assertEquals("dlroW olleH", WordReverser.reverseWords("World Hello"));
        assertEquals("", WordReverser.reverseWords(""));
        assertEquals(null, WordReverser.reverseWords(null));
    }
}
