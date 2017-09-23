package gang_of_four.behavioral.strategy.phrases;


import gang_of_four.behavioral.strategy.CatchPhrase;

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
