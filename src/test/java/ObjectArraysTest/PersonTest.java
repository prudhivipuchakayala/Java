package ObjectArraysTest;


import objectArrays.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testEqualsMethod() {
        Person person1 = new Person(170.0, 70.0, "123-45-6789", "1234567890");
        Person person2 = new Person(160.0, 60.0, "987-65-4321", "0987654321");
        Person person3 = new Person(180.0, 80.0, "123-45-6789", "1234567890");

        // Test equals method with same SSN
        assertTrue(person1.equals(person3));
        assertTrue(person3.equals(person1));

        // Test equals method with different SSN
        assertFalse(person1.equals(person2));
        assertFalse(person2.equals(person3));
    }

    @Test
    public void testHashCodeConsistency() {
        Person person1 = new Person(170.0, 70.0, "123-45-6789", "1234567890");
        Person person3 = new Person(180.0, 80.0, "123-45-6789", "1234567890");

        // Test hashCode consistency
        assertEquals(person1.hashCode(), person3.hashCode());
    }

    @Test
    public void testHashCodeInconsistency() {
        Person person1 = new Person(170.0, 70.0, "123-45-6789", "1234567890");
        Person person2 = new Person(160.0, 60.0, "987-65-4321", "0987654321");

        // Test hashCode inconsistency
        assertNotEquals(person1.hashCode(), person2.hashCode());
    }
}
