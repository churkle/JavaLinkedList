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
            start = end = current = tmp;
        }
        else
        {
            end.next = tmp;
            tmp.prev = end;
            end = tmp;
        }
    }

    /**
     * Adds item to the Linked List adjacent to given item if such item exists
     * @param item  Item to be added to the Linked List
     * @param prevItem  Item in the Linked List to add new item next to
     */
    public void addItem(Object item, Object prevItem)
    {
        if (start != null)
        {
            ListNode curPos = start;

            while (curPos != null)
            {
                if(curPos.item.equals(prevItem))
                {
                    ListNode tmp = curPos.next;
                    curPos.next = new ListNode(item);
                    curPos.next.next = tmp;
                    break;
                }
                else
                {
                    curPos = curPos.next;
                }
            }
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
     * Returns the next item in the Linked List and moves forward one ListNode
     * @return  The next item in the Linked List
     */
    public Object getNext()
    {
        if (current != null && current.next != null)
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
     * Returns the previous item in the Linked List and moves backward one ListNode
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

    /**
     * Returns the current item in the Linked List
     * @return  The current item in the Linked List
     */
    public Object getCur()
    {
        if(current != null)
        {
            return current.item;
        }
        else
        {
            return null;
        }
    }
}
