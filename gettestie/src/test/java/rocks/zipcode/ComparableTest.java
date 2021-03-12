package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class ComparableTest {

    @Test
    public void comparableTest1() {
        String string1 = "a simple string";


        int actual = string1.compareTo("a simple string");
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}
