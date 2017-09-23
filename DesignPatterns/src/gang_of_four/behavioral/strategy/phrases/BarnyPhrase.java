package gang_of_four.behavioral.strategy.phrases;


import gang_of_four.behavioral.strategy.CatchPhrase;

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
