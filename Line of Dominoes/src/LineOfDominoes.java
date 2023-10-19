import static java.lang.System.*;
import java.util.Scanner;

//Provided runner class
public class LineOfDominoes {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        out.println("Enter in maximum pip size:");
        int size = input.nextInt();
        DominoSet test = new DominoSet(size);
        out.println("Enter in a random seed:");
        int n = input.nextInt();
        test.shuffle(n);
        out.println("Starting set\n"+test.toString());
        //test.play();
        //out.println("Final set\n"+test);
        //out.println("Number of dominoes left: "+test.getCount());
    }
}
