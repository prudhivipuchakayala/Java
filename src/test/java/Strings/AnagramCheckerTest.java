package Strings;


import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramCheckerTest {

    @Test
    public void testAreAnagrams() {
        assertTrue(AnagramChecker.areAnagrams("listen", "silent"));
        assertFalse(AnagramChecker.areAnagrams("hello", "world"));
        assertFalse(AnagramChecker.areAnagrams("listen", "listens"));
        assertFalse(AnagramChecker.areAnagrams(null, "silent"));
        assertFalse(AnagramChecker.areAnagrams("listen", null));
    }
}
