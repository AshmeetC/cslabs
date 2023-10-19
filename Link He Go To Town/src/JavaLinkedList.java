import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
    private ListNode front;
    private ListNode back;
    private ListNode current;
    private int size;

    // creates a element Linked List
    public JavaLinkedList(ListNode x)
    {
        front = x;
        current = x;
        back = x;
    }

    // creates a linked list in the same order as the int array
    // at completion, the front is pointing to the first element,
    // the current is also pointing to the front element, and
    // the back is pointing to the end element
    public JavaLinkedList(int[] nums)
    {
        front = new ListNode(nums[0], null);
        current = front;
        for(int i = 1;i<nums.length; i++){
            current.setNext(new ListNode(nums[i], null));
            current = current.getNext();
            back = current;
        }
        current = front;
    }

    // add -- always adds behind the current pointer.
    // at end of method, the new ListNode is behind the current pointer,
    // as if it was added in the same manner as an iterator.
    public void add(ListNode x)
    {
        //System.out.println("Add");
        //System.out.println(current);
        ListNode f = front;
        if(f == current) {
            x.setNext(f);
            front = x;
            size++;
            return;
        }

        while(f.getNext()!=current && f!= current) {
            f = f.getNext();
        }

        ListNode n = current;
        f.setNext(x);
        x.setNext(n);
    }

    // remove -- remove the current pointer, at the end of the removal
    // the current point will be pointing to the next element or at a
    // null if it was the end. The removed null is returned, disconnected
    // to the linked list. If the current point is at null, nothing happens
    // and null is returned.
    public ListNode remove()
    {
        if(current!=front){
            ListNode temp = front;
            if(current!=null)
                while(temp.getNext()!=null && temp.getNext()!=current){
                    temp=temp.getNext();
                    //out.println(temp.getValue());
                }
            ListNode temp2 = current.getNext();
            current.setNext(null);
            temp.setNext(temp2);
        }
        else {
            current=current.getNext();
            front=current;
        }
        return current;
    }

    // get -- returns the current pointer node
    public ListNode current()
    {
        return current;
    }

    // front -- returns the front pointer's ListNode
    public ListNode front()
    {
        return front;
    }

    // back -- returns the back pointer's ListNode
    public ListNode back()
    {
        return back;
    }

    // resetCurrent -- resets the current pointer to the front
    public void resetCurrent()
    {
        current=front;
    }

    // next -- moves current to the right by one element
    public void next()
    {
        current=current.getNext();
    }

    // toString -- returns a String of the the entire linked list
    // surrounded by []. For example: [1, 2, 3, 4, 5]
    public String toString()
    {
        String out = "[";
        ListNode temp = front;
        while(temp!=null){
            out+= temp.getValue() + ", ";
            temp = temp.getNext();
        }
        out= out.substring(0, out.length()-2);
        out += "]";
        return out;
    }

    // size -- returns the current size of the linked list
    public int size()
    {
        int s = 0;
        ListNode temp = front;
        while(temp!=null){
            s++;
            temp = temp.getNext();
        }
        return s;
    }
    public void removeNode(ListNode theList, Object obj){
        if(theList.getValue()!=obj){
            while(theList!=null &&  theList.getNext()!=null && theList.getNext().getValue()!=obj){
                theList=theList.getNext();
            }
            ListNode temp = theList.getNext().getNext();
            theList.getNext().setNext(null);
            theList.setNext(temp);
        }
    }
    public int countOdds(ListNode List){
        int c = 0;
        while(List!=null){
            int z = (int)List.getValue();
            if(z%2==1)
                c++;
            List=List.getNext();
        }
        return c;
    }
    public void skipEveryOther(ListNode list){
        ListNode current = list;
        ListNode temp = list.getNext().getNext();
        while(temp!=null && list!=null && list.getNext()!=null){
            list.getNext().setNext(null);
            list.setNext(temp);
            list = list.getNext();
            if(list.getNext()!=null)
            temp = list.getNext().getNext();
        }
    }
    public int countNodes(ListNode theList){
        int c = 0;
        while(theList!=null){
            c++;
            theList=theList.getNext();
        }
        return c;
    }
}
/*public void doubleUp(ListNode list){
    ListNode current=list;
    while(current!=null){
    current.setNext(new ListNode(current.getValue(), current.getNext());
    current=current.getNext().getNext();
    }
}
*/

