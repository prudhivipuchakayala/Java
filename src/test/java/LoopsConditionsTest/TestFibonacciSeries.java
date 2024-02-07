package LoopsConditionsTest;

import LoopsConditions.FibonacciSeries;

public class TestFibonacciSeries {
    public static void main(String[] args) {
        int N = 10;
        System.out.println("Fibonacci Series up to " + N + " terms:");
        FibonacciSeries.printFibonacci(N);
    }
}
