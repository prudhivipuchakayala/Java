package Lambdas;

import java.util.Arrays;

public class CapitaliseFirstLetter {
    public static String[] capitalizeAndSort(String[] strings) {
        return Arrays.stream(strings)
                .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                .sorted()
                .toArray(size -> new String[size]);


    }
}
