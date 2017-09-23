package gof.behavioral.strategy;


import gof.behavioral.strategy.phrases.JoeyPhrase;
import gof.behavioral.strategy.phrases.YgrittePhrase;

public class StrategyTest {
    public static void main(String[] args) {
        Fan me = new Fan();

        me.changePhrase(new JoeyPhrase());
        me.sayPhrase();

        me.changePhrase(new YgrittePhrase());
        me.sayPhrase();
    }
}
