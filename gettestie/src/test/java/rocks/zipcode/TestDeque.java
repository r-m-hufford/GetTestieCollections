package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestDeque {

    // ARRAYDEQUE //
    @Test
    public void arrayDQTest1() {
        ArrayDeque<Integer> dq = new ArrayDeque<>(10);
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);

        dq.offer(50);
        dq.addLast(60);

        Integer actual = dq.getLast();
        Integer expected = 60;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void arrayDQTest2() {
        ArrayDeque<Integer> dq = new ArrayDeque<>(10);
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);


        dq.addLast(60);
        dq.offer(50);

        Integer actual = dq.getLast();
        Integer expected = 50;

        Assert.assertEquals(expected,actual);
    }

    // so what is the difference between offer and offerLast???????


}
