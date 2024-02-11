package Strings;


public class VowelCounter {
    public static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase to handle both upper and lower case vowels
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

