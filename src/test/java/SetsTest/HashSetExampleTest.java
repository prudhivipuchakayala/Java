package SetsTest;


import Sets.HashSetExample;
import org.junit.Test;
import java.util.HashSet;
import java.util.Iterator;
import static org.junit.Assert.assertEquals;

public class HashSetExampleTest {

    @Test
    public void testHashSetIteration() {
        HashSet<String> set = HashSetExample.createAndPopulateHashSet();

        // Test iteration using Iterator
        Iterator<String> iterator = set.iterator();
        int countIterator = 0;
        while (iterator.hasNext()) {
            iterator.next();
            countIterator++;
        }
        assertEquals(10, countIterator);

        // Test iteration using for loop
        int countForLoop = 0;
        for (String str : set) {
            countForLoop++;
        }
        assertEquals(10, countForLoop);

        // Test iteration using enhanced for loop
        int countEnhancedForLoop = 0;
        for (String str : set) {
            countEnhancedForLoop++;
        }
        assertEquals(10, countEnhancedForLoop);
    }
}
