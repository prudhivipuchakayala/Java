package LoopsConditionsTest;

import static org.junit.Assert.assertEquals;

import LoopsConditions.FizzBuzz;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        // Create an instance of FizzBuzz
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Test FizzBuzz output for numbers 1 to 15
        assertEquals("1", fizzBuzz.getFizzBuzzValue(1));
        assertEquals("2", fizzBuzz.getFizzBuzzValue(2));
        assertEquals("Fizz", fizzBuzz.getFizzBuzzValue(3));
        assertEquals("4", fizzBuzz.getFizzBuzzValue(4));
        assertEquals("Buzz", fizzBuzz.getFizzBuzzValue(5));


    }
}
