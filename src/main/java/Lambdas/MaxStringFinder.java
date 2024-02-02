package Lambdas;

import java.util.List;

public class MaxStringFinder {

    public String findMax(List<String> strings) {
        return strings.stream()
                .max(String::compareTo)  // Natural ordering
                .orElse(null);
    }
}
