package Strings;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelCounterTest {

    @Test
    public void testCountVowels() {
        // Test with a string containing all vowels
        assertEquals(5, VowelCounter.countVowels("aeiou"));

        // Test with a string containing all vowels in uppercase
        assertEquals(5, VowelCounter.countVowels("AEIOU"));

        // Test with a string containing no vowels
        assertEquals(0, VowelCounter.countVowels("xyz"));

        // Test with a string containing mixed characters including vowels
        assertEquals(3, VowelCounter.countVowels("hello world"));
    }
}
