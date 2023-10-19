import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class RandomWriter {
    public static void main(String args[])throws IOException
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the seed value:");
        int seed = input.nextInt();
        Random rand = new Random(seed);
        System.out.println("Enter the size of N-Gram:");
        int n = input.nextInt();
        System.out.println("Enter the number of words to generate:");
        int size = input.nextInt();
        Map<String, ArrayList<String>> map = createNGram(n,"hamlet.txt");

        String newText = createText(map, size, rand);
        printOut(newText);
        out.println();
    }

    public static void printOut(String text)
    {
        Scanner input = new Scanner(text);
        int count = 0;
        while(input.hasNext())
        {
            String word = input.next();
            out.print(word);
            count+=word.length();
            if(count<59)
                out.print(" ");
            else
            {
                count=0;
                out.println();
            }
        }
    }

    // Write the remaining methods, they do not have to be limited to 2 methods (I wrote 3 more methods)



    public static Map<String,ArrayList<String>> createNGram(int n, String filename) throws IOException
    {
    }

    public static String createText(Map<String,ArrayList<String>> map, int num, Random rand)
    {
    }
}