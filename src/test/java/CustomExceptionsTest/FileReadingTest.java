package CustomExceptionsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import CustomExceptions.FileReading;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileReadingTest {

    private static final String TEST_FILE_PATH = "test_file.txt";
    private static final String TEST_FILE_CONTENT = "This is a test file.\nIt contains some text.\n";

    @Before
    public void setUp() {
        try (FileWriter writer = new FileWriter(TEST_FILE_PATH)) {
            writer.write(TEST_FILE_CONTENT);
        } catch (IOException e) {
            fail("Failed to create test file: " + e.getMessage());
        }
    }

    @After
    public void tearDown() {
        File file = new File(TEST_FILE_PATH);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testReadFile() {
        try {
            String fileContent = FileReading.readFile(TEST_FILE_PATH);
            assertEquals(TEST_FILE_CONTENT, fileContent);
        } catch (IOException e) {
            fail("Failed to read test file: " + e.getMessage());
        }
    }
}
