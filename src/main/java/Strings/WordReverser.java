package Strings;


public class WordReverser {

    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.isEmpty())
            return sentence;

        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
