import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.ListIterator;
import static java.lang.System.*;

public class DominoSet {

    //The programmer writes all other necessary code

    /*
    Proviced shuffle class
    setOfDominoes is a List of Domino
    rotate is a method in Domino
    this is the only method allowed to use indicies
    */
    ArrayList<Domino> setOfDominoes;
    ArrayList<Domino> removed;

    public DominoSet (int size) {
        setOfDominoes = new ArrayList<Domino>();
        removed = new ArrayList<Domino>();
        for(int i = 0; i <= size; i++) {
            for(int j = i; j <= size; j++) {
                setOfDominoes.add(new Domino(i, j));
            }
        }
    }

    public void shuffle(int randSeed)
    {
        Random rand = new Random(randSeed);
        for(int i=0; i<setOfDominoes.size(); i++)
        {
            if(rand.nextBoolean())
                setOfDominoes.get(i).rotate();
            int k = rand.nextInt(setOfDominoes.size());
            Domino temp = setOfDominoes.get(k);
            setOfDominoes.set(k,setOfDominoes.get(i));
            setOfDominoes.set(i, temp);
        }
    }

    public void play() {
        ListIterator iter = setOfDominoes.listIterator();
        Domino p = null;
        Domino n = null;
        if(setOfDominoes.size() > 1) {
            while(iter.hasNext()) {
                if(p == null) {
                    p = (Domino)iter.next();
                } else {
                    p = n;
                }
                n = (Domino)iter.next();
                if(n.getPip2() == p.getPip2()) {
                    n.rotate();
                } else if(n.getPip1() != p.getPip2() && n.getPip2() != p.getPip2()) {
                    removed.add(n);
                    iter.remove();
                    iter = setOfDominoes.listIterator();
                    p = null;
                }
            }
        }

        iter = removed.listIterator();
        while(iter.hasNext()) {
            n = (Domino)iter.next();
            if(n.getPip1() == setOfDominoes.get(setOfDominoes.size()-1).getPip2()) {
                setOfDominoes.add(n);
                iter.remove();
                iter = removed.listIterator();
            } else if(n.getPip2() == setOfDominoes.get(setOfDominoes.size()-1).getPip2()) {
                n.rotate();
                setOfDominoes.add(n);
                iter.remove();
                iter = removed.listIterator();
            }
        }
    }

    public int getCount() {
        return removed.size();
    }

    public String toString() {
        ListIterator<Domino> iter = setOfDominoes.listIterator();
        String str = "";
        while(iter.hasNext()) {
            str += iter.next().toString();
        }
        return str;
    }
}