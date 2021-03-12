package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class TestHashSet {

    // HASHSET //
    @Test
    public void HashMSetTest1() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("all the pretty horses");
        hashSet.add("cities of the plain");
        hashSet.add("the crossing");

        Integer actual = hashSet.size();
        Integer expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    public void HashMSetTest2() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("all the pretty horses");
        hashSet.add("cities of the plain");
        hashSet.add("the crossing");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("cities of the plain");
        arrayList.add("the crossing");

        Boolean actual = hashSet.containsAll(arrayList);
        Boolean expected = true;
        assertEquals(expected,actual);
    }
}
