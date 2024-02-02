package LambdasTest;

import java.util.List;

import Lambdas.MaxStringFinder;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MaxStringFinderTest {

    @Test
    public void testFindMax() {
        MaxStringFinder finder = new MaxStringFinder();

        // Test case with normal strings
        List<String> inputList1 = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
        String result1 = finder.findMax(inputList1);
        assertEquals("orange", result1);

        List<String> inputList2 = Arrays.asList();
        String result2 = finder.findMax(inputList2);
        assertEquals(null, result2);

        List<String> inputList3 = Arrays.asList("apple", "apple", "apple");
        String result3 = finder.findMax(inputList3);
        assertEquals("apple", result3);
    }
}
