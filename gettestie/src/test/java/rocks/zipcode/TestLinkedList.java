package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {
    // LINKED LIST //
    @Test
    public void LinkedListTest1() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("timequake");
        linkedList.add("cats cradle");
        linkedList.add("armageddon in retrospect");

        linkedList.addLast("player piano");

        String actual = linkedList.get(3);
        String expected = "player piano";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void LinkedListTest2() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("timequake");
        linkedList.add("cats cradle");
        linkedList.add("armageddon in retrospect");

        linkedList.addLast("player piano");

        Integer actual = linkedList.size();
        Integer expected = 4;

        Assert.assertEquals(expected, actual);
    }

}

