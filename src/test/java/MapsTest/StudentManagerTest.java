package MapsTest;

import Maps.Student;
import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class StudentManagerTest {

    @Test
    public void testGetStudent() {
        StudentManager studentManager = new StudentManager();

        assertEquals("John", studentManager.getStudent("John").getFirstName());
        assertEquals("Alice", studentManager.getStudent("Alice").getFirstName());
        assertEquals("Bob", studentManager.getStudent("Bob").getFirstName());
        assertEquals("Emily", studentManager.getStudent("Emily").getFirstName());
        assertEquals("Michael", studentManager.getStudent("Michael").getFirstName());
        assertEquals("Sarah", studentManager.getStudent("Sarah").getFirstName());
        assertEquals("David", studentManager.getStudent("David").getFirstName());
        assertEquals("Emma", studentManager.getStudent("Emma").getFirstName());
    }

    static class StudentManager {
        private HashMap<String, Student> studentMap;

        public StudentManager() {
            this.studentMap = new HashMap<>();
            studentMap.put("John", new Student("John", "Doe", 3.5));
            studentMap.put("Alice", new Student("Alice", "Smith", 3.2));
            studentMap.put("Bob", new Student("Bob", "Johnson", 3.1));
            studentMap.put("Emily", new Student("Emily", "Brown", 3.8));
            studentMap.put("Michael", new Student("Michael", "Wilson", 3.9));
            studentMap.put("Sarah", new Student("Sarah", "Jones", 3.6));
            studentMap.put("David", new Student("David", "Davis", 3.3));
            studentMap.put("Emma", new Student("Emma", "Taylor", 3.4));
        }

        public Student getStudent(String firstName) {
            return studentMap.get(firstName);
        }
    }
}
