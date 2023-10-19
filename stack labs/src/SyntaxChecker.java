import java.util.*;
public class SyntaxChecker {
    Scanner sc;
    public SyntaxChecker(){
        sc=new Scanner(System.in);
    }
    public boolean checkExpression(){
        Stack<String> opens = new Stack<String>();
        Stack<String> close = new Stack<String>();
        boolean x = false;
        String y = sc.nextLine();
        String[] z = new String[y.length()];
        for(int i =0; i<y.length(); i++){
            z[i] = y.substring(i, i+1);
            //System.out.println(z[i]);
        }
        for(int i =0; i< z.length;i++){
            if(z[i].equals("(") || z[i].equals("{") || z[i].equals("[") || z[i].equals("<")){
                opens.push(z[i]);
            }
            else if(z[i].equals(")") || z[i].equals("}") || z[i].equals("]") || z[i].equals(">")){
                close.push(z[i]);
                if(close.size()>opens.size()){
                    return false;
                }
            }
        }
        if(opens.size()!=close.size())
            return false;
        return true;
    }
}
