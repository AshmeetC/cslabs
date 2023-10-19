import java.util.*;

public class Candidate {
    private String name;
    private PriorityQueue<Suitor> rank;

    public Candidate(String n)
    {
        name = n;
        rank = new PriorityQueue<Suitor>();
    }

    public String getName()
    {
        return name;
    }

    public void addSuitorToRank(Suitor k)
    {
        rank.add(k);
    }

    // returns a String of all the Suitors in ranked order
    public String getRanking()
    {
        String z = "";
        int i =0;
        while(rank.size()>0){
            String[] x = rank.remove().toString().split(". ");
            z+= "" + (i+1) + ". " + x[1] + " ";
            i++;
        }
        z=z.substring(0, z.length()-2);
        return z;
    }
}
