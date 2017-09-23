package gof.behavioral.strategy.phrases;

import gof.behavioral.strategy.CatchPhrase;

public class YgrittePhrase implements CatchPhrase {
    @Override
    public void sayPhrase() {
        System.out.println("You know nothing, John Snow");
    }

    @Override
    public boolean isGood() {
        return true;
    }
}
