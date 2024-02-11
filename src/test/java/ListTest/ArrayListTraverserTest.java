package ListTest;


import static org.junit.Assert.assertEquals;

import List.ArrayListTraverser;
import org.junit.Test;
import java.util.ArrayList;

public class ArrayListTraverserTest {

    @Test
    public void testTraverseWithForLoop() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        ArrayList<String> result = new ArrayList<>();
        ArrayListTraverser.traverseWithForLoop(list);
    }

    @Test
    public void testTraverseWithEnhancedForLoop() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        ArrayList<String> result = new ArrayList<>();
        ArrayListTraverser.traverseWithEnhancedForLoop(list);
    }
}
