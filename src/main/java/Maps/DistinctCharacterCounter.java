package Maps;

import java.util.Map;
import java.util.TreeMap;


import java.util.HashMap;
import java.util.Map;

public class DistinctCharacterCounter {

    public static String countDistinctCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Construct the output string
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != ' ' && charCountMap.containsKey(c)) {
                result.append(c).append("-").append(charCountMap.get(c)).append(", ");
                charCountMap.remove(c); // Remove the character to avoid duplicate entries
            }
        }

        // Remove the trailing comma and space
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        return result.toString();
    }
}

