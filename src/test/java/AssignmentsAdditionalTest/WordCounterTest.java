package AssignmentsAdditionalTest;

import static org.junit.Assert.assertEquals;

import AssignmentsAdditional.WordCounter;
import org.junit.Test;

public class WordCounterTest {

    @Test
    public void testCountUniqueWords() {
        String input = "hello world hello world";
        int expectedUniqueWordCount = 2;

        int actualUniqueWordCount = WordCounter.countUniqueWords(input);

        assertEquals(expectedUniqueWordCount, actualUniqueWordCount);
    }

    @Test
    public void testCountUniqueWordsWithEmptyString() {
        String input = "";
        int expectedUniqueWordCount = 0;

        int actualUniqueWordCount = WordCounter.countUniqueWords(input);

        assertEquals(expectedUniqueWordCount, actualUniqueWordCount);
    }

    @Test
    public void testCountUniqueWordsWithNullString() {
        String input = null;
        int expectedUniqueWordCount = 0;

        int actualUniqueWordCount = WordCounter.countUniqueWords(input);

        assertEquals(expectedUniqueWordCount, actualUniqueWordCount);
    }
}
