package gof.creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Deck deck = Deck.instance;

        System.out.println(deck.cards.size());
        Deck.instance.cards.add("King H");

        System.out.println(deck.cards.size());
        deck.cards.add("Seven D");

        System.out.println(deck.cards.size());
    }
}
