package gang_of_four.behavioral.strategy.phrases;

import gang_of_four.behavioral.strategy.CatchPhrase;

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
