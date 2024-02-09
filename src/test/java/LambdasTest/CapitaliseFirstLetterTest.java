package LambdasTest;

import Lambdas.CapitaliseFirstLetter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CapitaliseFirstLetterTest {
    @Test
    public void testCapitalizeAndSort() {
        String[] input = {"apple", "banana", "orange", "grape", "kiwi"};
        String[] expected = {"Apple", "Banana", "Grape", "Kiwi", "Orange"};
        assertArrayEquals(expected, CapitaliseFirstLetter.capitalizeAndSort(input));
    }
}
