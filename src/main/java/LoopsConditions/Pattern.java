package LoopsConditions;

public class Pattern {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 5; i >= 1; i--) {
            // Inner loop for printing '+'
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            // Inner loop for printing '-'
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print("-");
            }
            System.out.println(); // Move to the next line
        }
    }
}
