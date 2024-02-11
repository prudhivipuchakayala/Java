package MapsTest;


import Maps.TwoSum;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testFindTwoSum() {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] expectedIndices = {3, 5};

        int[] actualIndices = TwoSum.findTwoSum(nums, target);

        assertArrayEquals(expectedIndices, actualIndices);
    }
}
