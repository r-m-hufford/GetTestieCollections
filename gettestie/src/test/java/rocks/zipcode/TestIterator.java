package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    // ITERATOR //
    @Test
    public void IteratorTest1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        Iterator<Integer> it = numbers.iterator();

        // pulled the first element //
        Integer actual = it.next();
        Integer expected = 1;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void IteratorTest2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        Iterator<Integer> it = numbers.iterator();

        Integer actual = 0;
        //avoids out or bound baloney so common with for loops
        while (it.hasNext()) {
            actual += it.next();
        }

        Integer expected = 21;
        Assert.assertEquals(actual,expected);
    }

}
