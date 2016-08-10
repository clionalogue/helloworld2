import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by clionalogue on 10/08/16.
 */
public class HelloWorldTest {
    @Test
    public void getStringIsTwelveChar() throws Exception {

        Assert.assertEquals(12, HelloWorld.getString().length());
    }

    @Test
    public void getStringIsNotNull() throws Exception {

        Assert.assertNotNull(HelloWorld.getString());
    }

    @Test
    public void getStringStartsWithH() throws Exception {

        Assert.assertEquals('H', HelloWorld.getString().charAt(0));

    }

    @Test
    public void getString2IsEighteenChar() throws Exception {
        Assert.assertEquals(18, HelloWorld.getString2().length());

    }

    @Test
    public void getString2IsNotNull() throws Exception {
        Assert.assertNotNull(HelloWorld.getString2());

    }
}