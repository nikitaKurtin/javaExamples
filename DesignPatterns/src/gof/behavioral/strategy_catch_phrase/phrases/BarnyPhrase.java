package gof.behavioral.strategy_catch_phrase.phrases;


import gof.behavioral.strategy_catch_phrase.CatchPhrase;

public class BarnyPhrase implements CatchPhrase {
    @Override
    public void sayPhrase() {
        System.out.println("It's gonna be Legend -wait for it- dary!");
    }

    @Override
    public boolean isGood() {
        return true;
    }
}
