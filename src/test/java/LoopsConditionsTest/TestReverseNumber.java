package LoopsConditionsTest;

import LoopsConditions.ReverseNumber;

public class TestReverseNumber {
    public static void main(String[] args) {
        // Test cases
        int[] numbers = {12345, 987654321, 1001, 87654321};

        // Test each number and print the reversed result
        for (int num : numbers) {
            System.out.println("Original Number: " + num);
            int reversed = ReverseNumber.reverse(num);
            System.out.println("Reversed Number: " + reversed);
            System.out.println();
        }
    }
}
