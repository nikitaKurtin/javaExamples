package gof.behavioral.strategy_catch_phrase;


import gof.behavioral.strategy_catch_phrase.phrases.YgrittePhrase;

public class Fan {
    private CatchPhrase currentPhrase;

    public Fan() {
        currentPhrase = new YgrittePhrase();
    }

    public void changePhrase(CatchPhrase phrase) {
        this.currentPhrase = phrase;
    }

    public void sayPhrase() {
        String goodPhrase = currentPhrase.isGood() ? "Good" : "Bad";
        System.out.println("this is a " + goodPhrase + " phrase:");
        System.out.print('\t');
        currentPhrase.sayPhrase();
    }
}
