package ListTest;


import List.ArrayListRemover;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayListRemoverTest {

    @Test
    public void testRemoveLastObject() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        ArrayListRemover.removeLastObject(list);

        ArrayList<Object> expectedList = new ArrayList<>();
        expectedList.add("Hello");
        expectedList.add("World");

        assertEquals(expectedList, list);
    }

}
