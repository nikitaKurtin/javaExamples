package gof.behavioral.strategy;


import gof.behavioral.strategy.phrases.YgrittePhrase;

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
