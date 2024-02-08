package ThreadsTest;

import Threads.NumberPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class NumberPrinterTest {
    @Test
    public void test() {
        Thread evenThread = new Thread(new NumberPrinter(2, 60));
        Thread oddThread = new Thread(new NumberPrinter(1, 59));

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
