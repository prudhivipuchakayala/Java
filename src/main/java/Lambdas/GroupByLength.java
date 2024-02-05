package Lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByLength {

    public static Map<Integer, List<String>> groupByLength(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
