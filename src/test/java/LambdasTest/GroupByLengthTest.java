package LambdasTest;

import Lambdas.GroupByLength;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupByLengthTest {

    @Test
    public void testGroupByLength() {
        List<String> inputStrings = Arrays.asList("apple", "banana", "pear", "kiwi", "grape", "orange");

        Map<Integer, List<String>> result = GroupByLength.groupByLength(inputStrings);

        assertEquals(2, result.get(4).size());
        Assertions.assertTrue(result.get(6).size() < 3);

        assertEquals(Arrays.asList("pear", "kiwi"), result.get(4));
        assertEquals(Arrays.asList("banana", "orange"), result.get(6));
    }
}
