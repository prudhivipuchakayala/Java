package Sets;


import java.util.LinkedHashSet;

public class CharRemover {

    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            charSet.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }
}
