package linked;

import org.junit.Test;
import sun.awt.image.ImageWatched;

import static org.junit.Assert.*;

/**
 * Created by churkle on 6/26/15.
 */
public class LinkedListTest
{

    @Test
    public void testAddItem() throws Exception
    {
        LinkedList myList = new LinkedList();
        myList.addItem("Hello");
        assertEquals("Hello", myList.getFirst());

        myList.addItem("GoodBye");
        assertEquals("GoodBye", myList.getNext());

        myList.addItem(3);
        assertEquals(3, myList.getNext());
    }

    @Test
    public void testGetFirst() throws Exception
    {
        LinkedList myList = new LinkedList();
        myList.addItem("Hello");
        myList.addItem(54);
        myList.addItem("Goodbye");
        assertEquals("Hello", myList.getFirst());

        LinkedList nullList = new LinkedList();
        assertEquals(null, nullList.getFirst());
    }

    @Test
    public void testGetNext() throws Exception
    {
        LinkedList myList = new LinkedList();
        myList.addItem("Bob");
        assertEquals("Bob", myList.getFirst());
        assertEquals(null, myList.getNext());
    }

    @Test
    public void testGetPrev() throws Exception
    {
        LinkedList myList = new LinkedList();
        myList.addItem("First");
        myList.addItem("Second");
        myList.addItem("Third");

        for (int i = 0; i < 3; i++)
        {
            myList.getNext();
        }

        assertEquals("Second", myList.getPrev());
        assertEquals("First", myList.getPrev());
        assertEquals(null, myList.getPrev());
    }
}