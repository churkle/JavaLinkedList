package linked;

/**
 * A node of a Linked List
 */

public class ListNode
{
    /**
     * Creates a new ListNode containing item
     * @param item  Item to store in ListNode
     */
    public ListNode(Object item)
    {
        this.item = item;
        next = prev = null;
    }

    /**
     * Return class name and object
     * @return Class name and object
     */
    @Override
    public String toString()
    {
        return "ListItem " + item;
    }

    ListNode next, prev;
    Object item;
}
