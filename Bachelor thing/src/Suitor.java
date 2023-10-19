public class Suitor implements Comparable<Suitor> {
    private String name;
    private int ranking;

    public Suitor(String n, int r)
    {
        name = n;
        ranking = r;
    }

    public int compareTo(Suitor oth)
    {
        return ranking - oth.ranking;
    }

    public String toString()
    {
        return ranking+". "+name;
    }
}