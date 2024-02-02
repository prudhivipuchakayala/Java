package AssignmentsAdditionalTest;

import AssignmentsAdditional.CaseSwapper;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CaseSwapperTest {

    @Test
    public void testSwapCases() {
        CaseSwapper caseSwapper = new CaseSwapper();

        assertEquals("hELLO wORLD", caseSwapper.swapCases("Hello World"));

        assertEquals("uppercase", caseSwapper.swapCases("UPPERCASE"));

        assertEquals("LOWERCASE", caseSwapper.swapCases("lowercase"));

        assertEquals("123!@#", caseSwapper.swapCases("123!@#"));
    }
}

