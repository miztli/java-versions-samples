package java12.strings;

import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

public class StringTest
{
    @Test
    public void testNewStringAPI() {
        Assert.assertFalse("\"Hello world!\" <-- not blank", "Hello world!".isBlank());
        Assert.assertTrue("\"\" <-- blank", "".isBlank());
        Assert.assertTrue("\" \" <-- blank", " ".isBlank());

        final Stream<String> stringStream = "Hello world!\r My name is Miztli".lines();
        Assert.assertTrue(stringStream.count() == 2);

        Assert.assertEquals("Hello world!Hello world!Hello world!", "Hello world!".repeat(3));

        Assert.assertEquals("HELLO WORLD!", "Hello world!".transform(String::toUpperCase));
    }
}
