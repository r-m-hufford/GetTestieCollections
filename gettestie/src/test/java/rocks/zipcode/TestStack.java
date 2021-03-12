package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import sun.jvm.hotspot.debugger.Address;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test


    // STACK //
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStack2() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");

        String peek = stack.peek();

        Assert.assertEquals(peek, "Hello world");
    }

}
