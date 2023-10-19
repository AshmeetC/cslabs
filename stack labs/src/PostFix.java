import java.util.ArrayList;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
import static java.lang.System.*;
import java.util.*;
public class PostFix {
    double x;
    public PostFix(String z)
    {
        x =0;
        Stack<Double> nums = new Stack<Double>();
        Stack<String> ops = new Stack<String>();
        String[] things= z.split(" ");
        for(int i =0; i<things.length; i++){
            //out.println(things[i]);
            //int k = (int) things[i].charAt(0);
            if(things[i].equals("*") || things[i].equals("/") || things[i].equals("+") || things[i].equals("-")){
                ops.push(things[i]);
                if(ops.peek().equals("*")){
                    double d = nums.peek();
                    nums.push(nums.pop() * nums.pop());
                    //out.println("m" + nums.peek()/d + " x " + d);
                } else if (ops.peek().equals("/")) {
                    double d = nums.peek();
                    double z1 = nums.pop();
                    nums.push(nums.pop() / z1);
                    //out.println("d" + (nums.peek()*d) + " / " + z1);
                } else if (ops.peek().equals("+")) {
                    double d = nums.peek();
                    nums.push(nums.pop() + nums.pop());
                    //out.println("p" + (nums.peek()-d) + " + " + d);
                } else if (ops.peek().equals("-")) {
                    double d = nums.peek();
                    double z1 = nums.pop();
                    nums.push(nums.pop() - z1);
                    //out.println("-" + (nums.peek()+d) + " - " + d);
                }
            }
            else{nums.push(Double.parseDouble(things[i]));}
            //out.println(nums.peek());
            //if(ops.size()>=1)
            //out.println(ops.peek());
        }
        x=nums.pop();
    }
    public double getX(){
        return x;
    }
}
