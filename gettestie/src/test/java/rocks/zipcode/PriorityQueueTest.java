package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    // ARRAYDEQUE //
    @Test
    public void arrayDQTest1() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(10);
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);

        //top element is 10. First in, First Out.
        Integer actual = pq.poll();
        Integer expected = 10;
        Assert.assertEquals(expected,actual);
    }


}
