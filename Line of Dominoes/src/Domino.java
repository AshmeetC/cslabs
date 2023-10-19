//Provided Domino Class
public class Domino {
    private int pip1,pip2;

    public Domino(int x, int y)
    {
        pip1 = x;
        pip2 = y;
    }

    public int getPip1() {return pip1;}
    public int getPip2() {return pip2;}
    public void rotate()
    {
        int temp = pip1;
        pip1 = pip2;
        pip2 = temp;
    }

    public String toString()
    {
        return "["+pip1+"|"+pip2+"]";
    }
}
