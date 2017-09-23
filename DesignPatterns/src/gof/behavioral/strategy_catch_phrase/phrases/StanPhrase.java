package gof.behavioral.strategy_catch_phrase.phrases;

import gof.behavioral.strategy_catch_phrase.CatchPhrase;

public class StanPhrase implements CatchPhrase {
    @Override
    public void sayPhrase() {
        System.out.println("Oh my God, they killed Kenny");
    }

    @Override
    public boolean isGood() {
        return true;
    }
}
