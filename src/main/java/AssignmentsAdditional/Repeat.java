package AssignmentsAdditional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repeat {

    public static List<Integer> findRepeated(int number) {
        Set<Integer> uniqueDigits = new HashSet<>();
        Set<Integer> repeatedDigits = new HashSet<>();

        while (number > 0) {
            int digit = number % 10;
            if (!uniqueDigits.add(digit)) {
                repeatedDigits.add(digit);
            }
            number /= 10;
        }

        return new ArrayList<>(repeatedDigits);
    }
}
