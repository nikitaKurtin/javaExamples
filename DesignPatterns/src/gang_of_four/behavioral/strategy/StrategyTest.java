package gang_of_four.behavioral.strategy;


import gang_of_four.behavioral.strategy.phrases.JoeyPhrase;
import gang_of_four.behavioral.strategy.phrases.YgrittePhrase;

public class StrategyTest {
    public static void main(String[] args) {
        Fan me = new Fan();

        me.changePhrase(new JoeyPhrase());
        me.sayPhrase();

        me.changePhrase(new YgrittePhrase());
        me.sayPhrase();
    }
}
