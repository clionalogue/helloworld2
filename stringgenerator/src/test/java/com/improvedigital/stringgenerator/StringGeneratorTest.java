package com.improvedigital.stringgenerator;

import com.improvedigital.stringgenerator.StringGenerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by clionalogue on 10/08/16.
 */
public class StringGeneratorTest {
    @Test
    public void getStringIsTwelveChar() throws Exception {

        Assert.assertEquals(12, StringGenerator.getString().length());
    }

    @Test
    public void getStringIsNotNull() throws Exception {

        Assert.assertNotNull(StringGenerator.getString());
    }

    @Test
    public void getStringStartsWithH() throws Exception {

        Assert.assertEquals('H', StringGenerator.getString().charAt(0));

    }

    @Test
    public void getString2IsEighteenChar() throws Exception {
        Assert.assertEquals(18, StringGenerator.getString2().length());

    }

    @Test
    public void getString2IsNotNull() throws Exception {
        Assert.assertNotNull(StringGenerator.getString2());

    }

}