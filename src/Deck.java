
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;

    public Deck(String[] Deck, String[] Suits, int[] pointValue)
    {
        unDealt = new ArrayList<Card>();
        Dealt = new ArrayList<Card>();
        for(int i=0;i< Deck.length;i++)
        {
            for(int j=0;j< Suits.length;j++)
            {

                unDealt.add(new Card(Deck[i],Suits[j],pointValue[i]));

            }
        }
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
        for(int i=unDealt.size()-1;i>0;i--)
        {
            int pos = (int) (Math.random() * i);
            Card temp = unDealt.get(i);
            unDealt.set(i,unDealt.get(pos));
            unDealt.set(pos,temp);
        }
    }
}




