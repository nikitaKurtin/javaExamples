package gang_of_four.behavioral.strategy.phrases;

import gang_of_four.behavioral.strategy.CatchPhrase;

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
