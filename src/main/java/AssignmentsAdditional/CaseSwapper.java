package AssignmentsAdditional;

public class CaseSwapper {
    public String swapCases(String i) {
        StringBuilder result = new StringBuilder();

        for (char c : i.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
