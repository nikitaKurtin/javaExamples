package gof.behavioral.strategy.phrases;


import gof.behavioral.strategy.CatchPhrase;

public class JoeyPhrase implements CatchPhrase {
    @Override
    public void sayPhrase() {
        System.out.println("How are you doing?");
    }

    @Override
    public boolean isGood() {
        return false;
    }
}
