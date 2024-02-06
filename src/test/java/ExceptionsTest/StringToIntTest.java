package ExceptionsTest;

import Exceptions.StringToInt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringToIntTest {
    @Test
    void testConvertStringToInt() {
        assertEquals(23, StringToInt.convertStringToInt("23"));
        assertEquals(0, StringToInt.convertStringToInt("0"));
        assertEquals(-123, StringToInt.convertStringToInt("-123"));
        assertEquals(0, StringToInt.convertStringToInt("45.67"));
        assertEquals(0, StringToInt.convertStringToInt("test"));
        assertEquals(0, StringToInt.convertStringToInt("123f"));
    }
}