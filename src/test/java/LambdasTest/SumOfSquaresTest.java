package LambdasTest;

import Lambdas.SumOfSquares;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfSquaresTest {

    @Test
    public void testSumOfSquares() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, -4, 5, -6, 7);

        int result = SumOfSquares.sumOfSquares(numbers);

        assertEquals(1 + 4 + 9 + 25 + 49, result);
    }
}
