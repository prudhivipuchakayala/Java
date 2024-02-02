package LambdasTest;

import Lambdas.RemoveDuplicates;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates remover = new RemoveDuplicates();

        // Test case with duplicate elements
        List<Integer> inputList1 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6);
        List<Integer> result1 = remover.removeDuplicates(inputList1);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), result1);

        // Test case with no duplicates
        List<Integer> inputList2 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> result2 = remover.removeDuplicates(inputList2);
        assertEquals(Arrays.asList(10, 20, 30, 40, 50), result2);

        // Test case with an empty list
        List<Integer> inputList3 = Arrays.asList();
        List<Integer> result3 = remover.removeDuplicates(inputList3);
        assertEquals(Arrays.asList(), result3);
    }
}
