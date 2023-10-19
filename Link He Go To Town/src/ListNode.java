public class ListNode
{
    private Comparable listNodeValue;
    private ListNode nextListNode;

    public ListNode()
    {
        listNodeValue = null;
        nextListNode = null;
    }

    public ListNode(Comparable value)
    {
        listNodeValue = value;
        nextListNode = null;
    }

    public ListNode(Comparable value, ListNode next)
    {
        listNodeValue=value;
        nextListNode=next;
    }

    public Comparable getValue()
    {
        return listNodeValue;
    }

    public ListNode getNext()
    {
        return nextListNode;
    }

    public void setValue(Comparable value)
    {
        listNodeValue = value;
    }

    public void setNext(ListNode next)
    {
        nextListNode = (ListNode)next;
    }
}
/*
public void skipEveryOther(ListNode list){
ListNode current = list;
ListNode temp = list.getNext().getNext();
    while(temp!=null){
        current.getNext().setNext(null);
        list.setNext(temp);
    }
}
public void skipEveryOther(ListNode list){
ListNode current = list;
ListNode temp = list.getNext().getNext();
    while(temp!=null){
        current.getNext().setNext(null);
        list.setNext(temp);
    }
}
 */