import java.util.*;
public class PalinList
{
    private Queue<String> queue;
    private Stack<String> stack;

    public PalinList(String list)
    {
        queue = new LinkedList<String>();
        stack = new Stack<String>();
        String k = "";
        for(int i =0; i<list.length(); i++){
            if(!list.substring(i, i+1).equals(" "))
                k+= list.substring(i, i+1) + " ";
        }
        String[] list2 = k.split(" ");
        for(int i =0; i<list2.length; i++){
            queue.add(list2[i]);
            stack.add(list2[i]);
        }
        System.out.println(queue);
        System.out.println(stack);
    }

    public boolean isPalin()
    {
        int x = stack.size();
        if(x%2!=0){
            x=(x/2)+1;
        }else{
            x=x/2;
        }
        for(int i =0; i<stack.size(); i++){
            if(stack.size()!=x){
                if(!stack.pop().equals(reverse(queue.remove()))){
                    return false;
                }
            }else {
                if (!stack.pop().equals(queue.remove())) {
                    return false;
                }
            }
        }
        return true;
    }
    public String reverse(String s){
        String r = "";
        for(int i =s.length()-1; i>=0; i--){
            r+=s.substring(i, i+1);
        }
        System.out.println(s);
        System.out.println(r);
        return r;
    }
}