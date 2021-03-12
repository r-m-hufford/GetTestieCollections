package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {

    // ARRAYLIST //
    @Test
    public void TestArrayList1() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("so");
        arrayList.add("it");
        arrayList.add("goes");

        Integer expected = arrayList.size();
        Integer actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestArrayList2() {
        ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("Welcome to the Monkeyhouse");
        arrayList.clear();

        Integer expected = arrayList.size();
        Integer actual = 0;

        Assert.assertEquals(expected, actual);
    }
}
