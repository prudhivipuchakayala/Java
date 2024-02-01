package AssignmentsAdditionalTest;

import AssignmentsAdditional.PalindromeApp;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeAppTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeApp.isPalindrome(121));
        assertFalse(PalindromeApp.isPalindrome(1234));
        assertTrue(PalindromeApp.isPalindrome(1221));

    }
}
