package AssignmentsAdditional;

import java.util.HashSet;
import java.util.Set;

public class WordCounter {

    public static int countUniqueWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0; // Return 0 for null or empty input
        }

        String[] words = str.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();

        // Add each word to the set of unique words
        for (String word : words) {
            uniqueWords.add(word);
        }

        return uniqueWords.size();
    }
}
