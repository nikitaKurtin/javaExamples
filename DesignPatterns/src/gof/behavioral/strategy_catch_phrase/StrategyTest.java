package gof.behavioral.strategy_catch_phrase;


import gof.behavioral.strategy_catch_phrase.phrases.JoeyPhrase;
import gof.behavioral.strategy_catch_phrase.phrases.YgrittePhrase;

public class StrategyTest {
    public static void main(String[] args) {
        Fan me = new Fan();

        me.changePhrase(new JoeyPhrase());
        me.sayPhrase();

        me.changePhrase(new YgrittePhrase());
        me.sayPhrase();
    }
}
