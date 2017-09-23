package gof.creational.singleton;

import java.util.ArrayList;

class Deck {
    static Deck instance = new Deck();
    final ArrayList<String> cards;

    private Deck() {
        cards = new ArrayList<>();
        cards.add("Jack D");
        cards.add("Jack H");
        cards.add("Jack S");
        cards.add("Jack C");
    }
}
