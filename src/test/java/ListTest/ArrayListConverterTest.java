package ListTest;


import List.ArrayListConverter;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class ArrayListConverterTest {

    @Test
    public void testConvertToArray() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        String[] expectedArray = {"Hello", "World", "Java"};
        String[] actualArray = ArrayListConverter.convertToArray(list);

        assertArrayEquals(expectedArray, actualArray);
    }
}
