package linked;

/**
 * Implementation of a Linked List
 */
public class LinkedList
{
    private ListNode start;
    private ListNode current;
    private ListNode end;

    /**
     * Default constructor creating empty Linked List
     */
    public LinkedList()
    {
        start = current = end = null;
    }

    /**
     * Constructs Linked List with single item
     * @param item  Item to be contained in ListNode
     */
    public LinkedList(Object item)
    {
        if(item != null)
        {
            start = current = end = new ListNode(item);
        }
    }

    /**
     * Constructs a LinkedList out of an array of items
     * @param items Array of items to be contained in Linked List
     */
    public LinkedList(Object[] items)
    {
        if (items != null)
        {
            for (Object item : items)
            {
                addItem(item);
            }
        }
    }

    /**
     * Adds item to the Linked List
     * @param item  Item to be added to the Linked List
     */
    public void addItem(Object item)
    {
        ListNode tmp = new ListNode(item);

        if(start == null)
        {
            start = end = tmp;
        }
        else
        {
            end.next = tmp;
            tmp.prev = end;
            end = tmp;
        }
    }

    /**
     * Returns first item in the Linked List
     * @return  First item in the Linked List
     */
    public Object getFirst()
    {
        if(start != null)
        {
            return start.item;
        }
        else
        {
            return null;
        }
    }

    /**
     * Returns the next item in the Linked List
     * @return  The next item in the Linked List
     */
    public Object getNext()
    {
        if (current != null)
        {
            current = current.next;
            return current.item;
        }
        else
        {
            return null;
        }
    }

    /**
     * Returns the previous item in the Linked List
     * @return  The previous item in the Linked List
     */
    public Object getPrev()
    {
        if (current != null && current.prev != null)
        {
            current = current.prev;
            return current.item;
        }
        else
        {
            return null;
        }
    }
}
