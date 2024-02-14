package ThreadsTest;
import static org.junit.Assert.*;

import Threads.Singleton;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        // Get two instances of Singleton
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances are the same
        assertSame(instance1, instance2);
    }

    @Test
    public void testSingletonMessage() {
        // Get an instance of Singleton
        Singleton instance = Singleton.getInstance();

        // Call the method to show message
        instance.showMessage();
        // Assuming showMessage() prints the message to console, we cannot assert its output
        // We can only assert that the method is invoked without errors
    }
}
