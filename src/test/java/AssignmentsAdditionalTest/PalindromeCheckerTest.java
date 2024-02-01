package AssignmentsAdditionalTest;

import AssignmentsAdditional.PalindromeChecker;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
    @Test
    void testIsPalindrome() {
        assertEquals(121, 121);
        assertTrue(PalindromeChecker.isPalindrome(1221));
        assertFalse(PalindromeChecker.isPalindrome(123));
        assertFalse(PalindromeChecker.isPalindrome(12345));
        assertTrue(PalindromeChecker.isPalindrome(0));
        assertTrue(PalindromeChecker.isPalindrome(11));
    }
}
