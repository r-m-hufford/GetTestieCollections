package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    // HASHMAP //
    @Test
    public void HashMapTest1() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"for the money");
        hashMap.put(2,"for the show");
        hashMap.put(3,"to make ready");

        String actual = hashMap.get(1);
        String expected = "for the money";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void HashMapTest2() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"pepperoni");
        hashMap.put(2,"bacon");
        hashMap.put(3,"salami");

        String actual = "";
        for (String curedMeats : hashMap.values()) {
            actual += curedMeats;
        }
        String expected = "pepperonibaconsalami";
        Assert.assertEquals(expected,actual);
    }


}
