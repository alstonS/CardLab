public class Runner {
    public static void main(String[] args) {

        String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int[] pointValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Deck testDeck = new Deck(suit, rank, pointValue);
        for (int i = 0; i < 52; i++) {
            System.out.println(testDeck.deal());
        }
        testDeck.shuffle();
        System.out.println("\nShuffled Deck\n");
        for (int i = 0; i < 52; i++) {
            System.out.println(testDeck.deal());
        }
    }

}


