package Day5;

public class Static {
    // Static variable
    private static int staticVariable;

    // Static method to return the value of the static variable
    public static int getStaticVariable() {
        return staticVariable;
    }

    // Static method to set the value of the static variable
    public static void setStaticVariable(int value) {
        staticVariable = value;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Set the static variable
        Static.setStaticVariable(10);

        // Get and print the value of the static variable
        System.out.println("Static variable value: " + Static.getStaticVariable());
    }
}

