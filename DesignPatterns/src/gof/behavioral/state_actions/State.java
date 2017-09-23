package gof.behavioral.state_actions;

public interface State {
    void toggle(Player player);

    void play(Player player);

    void pause(Player player);
}
