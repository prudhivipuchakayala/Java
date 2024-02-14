package Threads;

public class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {}

    // Public static method to get the instance
    public static Singleton getInstance() {
        // Lazy initialization: create the instance when it's accessed for the first time
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Method to demonstrate the Singleton instance
    public void showMessage() {
        System.out.println("Hello, I am a Singleton instance!");
    }
}
