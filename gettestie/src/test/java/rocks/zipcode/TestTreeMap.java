package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TestTreeMap {

    // TREEMAP //
    @Test
    public void TreeMapTest1() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1982,"deadeye dick");
        treeMap.put(1985,"galapagos");
        treeMap.put(1959,"sirens of titan");

        Integer expected = 1959;
        Integer actual = treeMap.firstKey();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TreeMapTest2() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1982,"deadeye dick");
        treeMap.put(1985,"galapagos");
        treeMap.put(1959,"sirens of titan");

        treeMap.remove(1982);

        Boolean actual = treeMap.containsKey(1982);
        Boolean expected = false;

        Assert.assertEquals(expected,actual);
    }


}
