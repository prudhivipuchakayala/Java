package ObjectArraysTest;


import objectArrays.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testProductComparison() {
        Product p1 = new Product(1, 2.5, 10.0);
        Product p2 = new Product(2, 3.0, 15.0);
        Product p3 = new Product(3, 1.5, 7.5);

        assertEquals(-1, p1.compareTo(p2)); // p1 is cheaper than p2
        assertEquals(1, p2.compareTo(p3)); // p2 is more expensive than p3
        assertEquals(0, p1.compareTo(p1)); // p1 and p1 have the same price
    }
}
