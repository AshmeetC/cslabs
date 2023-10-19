import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class RemoveCards {

    public static void main(String args[])
    {
        out.println("Please Enter Deck:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        UnoDeck deck = new UnoDeck(s);
        out.println("Deck: "+deck.toString());
        out.println("Please enter command. Enter STOP to end program");
        while(sc.hasNextLine()){
            String command = sc.nextLine();
            if(command.equals("STOP")){
                out.println("Deck: "+deck.toString());
                break;
            }
            else{
                String[] list = command.split(" ");
                if(list[0].equals("value")){
                    listValueToRemove(list[1], deck);
                    out.println("Remove " + list[1]);
                }
                else if(list[0].equals("color")){
                    listColorToRemove(list[1], deck);
                    out.println("Remove " + list[1]);
                }
                else if(list[0].equals("range")){
                    listRangeToRemove(list[1], list[2], deck);
                    out.println("Remove " + list[1] + " thru " + list[2]);
                }
                else if(list[0].equals("rangecolor")){
                    listRangeColorToRemove(list[1], list[2], list[3], deck);
                    out.println("Remove " + list[1] + " thru " + list[2] + " color:" + list[3]);
                }
            }
        }
    }

    // The following methods are suggested methods for the programmer to write.
    public static ArrayList<UnoCards> listRangeColorToRemove(String start, String end, String color, UnoDeck deck)
    {
        ListIterator<UnoCards> iter = deck.getDeck().listIterator();
        while(iter.hasNext()){
            UnoCards card = iter.next();
            if(card.getColor().equals(color)){
                if(card.getValue().compareTo(start) >= 0 && card.getValue().compareTo(end) <= 0){
                    iter.remove();
                }
            }
        }
        return deck.getDeck();
    }

    public static ArrayList<UnoCards> listRangeToRemove(String start, String end, UnoDeck deck)
    {
        //deck.sortDeck();
        ListIterator<UnoCards> iter = deck.getDeck().listIterator();
        while(iter.hasNext()){
            UnoCards card = iter.next();
            if(card.getValue().compareTo(start)>=0 && card.getValue().compareTo(end)<=0){
                iter.remove();
            }
        }
        return deck.getDeck();
    }

    public static ArrayList<UnoCards> listValueToRemove(String val, UnoDeck deck)
    {
        ListIterator<UnoCards> iter = deck.getDeck().listIterator();
        while(iter.hasNext())
        {
            UnoCards k = iter.next();
            if(k.getValue().equals(val))
                iter.remove();
        }
        return deck.getDeck();
    }

    public static ArrayList<UnoCards> listColorToRemove(String val, UnoDeck deck)
    {
        ListIterator<UnoCards> iter = deck.getDeck().listIterator();
        while(iter.hasNext())
        {
            UnoCards k = iter.next();
            if(k.getColor().equals(val))
                iter.remove();
        }
        return deck.getDeck();
    }

    public static void removal(ArrayList<UnoCards> findList, UnoDeck deck)
    {

    }
}
