package Exceptions;

public class StringToInt {
    public static int convertStringToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred");
            return 0;
        }

    }
}
