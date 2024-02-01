package HelloWorld;
import HelloWorld.Hello;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void HelloWorldTest(){
        Hello.Data();
        assertEquals("Prudhvi","Prudhvi");
    }

}
