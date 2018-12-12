import sun.util.resources.cldr.ar.CalendarData_ar_DZ;

import javax.smartcardio.Card;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;

    public Deck(String[] Deck, String[] Suits, int[] pointValue)
    {
        unDealt = new ArrayList<Card>();
        Dealt = new ArrayList<Card>();



    }
    public ArrayList<Card> getUnDealt()
    {
        return unDealt;
    }
    public ArrayList<Card> getDealt()
    {
        return Dealt;
    }
    public boolean isEmpty()
    {
        if(Dealt.size() == 0) return true;
        else return false;

    }
    public int getSize()
    {
        return unDealt.size();

    }
    public Card deal()
    {
        if(unDealt.size() > 0)
        {
          Dealt.add(unDealt.get(0));
          Card word = unDealt.get(0);
          unDealt.remove(0);
          return word;
        }
        else return null;
    }
    public void shuffle()
    {
        for(int i=0; i<Dealt.size();i++)
        {
            unDealt.add(Dealt.get(0));
            Dealt.remove(0);
        }


    }



}
