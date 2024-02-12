package AssignmentsAdditionalTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import AssignmentsAdditional.RotationChecker;
import org.junit.Test;

public class RotationCheckerTest {

    @Test
    public void testIsRotation() {
        String str1 = "hello";
        String str2 = "lohel";
        assertTrue(RotationChecker.isRotation(str1, str2));
    }

    @Test
    public void testIsRotationWithEmptyStrings() {
        String str1 = "";
        String str2 = "";
        assertTrue(RotationChecker.isRotation(str1, str2));
    }

    @Test
    public void testIsRotationWithDifferentLengthStrings() {
        String str1 = "hello";
        String str2 = "world";
        assertFalse(RotationChecker.isRotation(str1, str2));
    }

    @Test
    public void testIsRotationWithNullStrings() {
        String str1 = null;
        String str2 = "hello";
        assertFalse(RotationChecker.isRotation(str1, str2));
    }
}
