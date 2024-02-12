package AssignmentsAdditional;

import java.util.HashMap;
import java.util.Map;

public class RepeatedChars {

    public static void main(String[] args) {
        String input = "hello world";
        printRepeatedChars(input);
    }

    public static void printRepeatedChars(String str) {
        Map<Character, Integer> charFreq = new HashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        // Print repeated characters
        StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
            if (entry.getValue() > 1) {
                output.append("Character '").append(entry.getKey()).append("' is repeated ").append(entry.getValue()).append(" times.\n");
            }
        }

        System.out.println(output.toString().trim());
    }
}
