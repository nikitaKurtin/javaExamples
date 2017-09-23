package gang_of_four.behavioral.state;

public interface State {
    void toggle(Player player);

    void play(Player player);

    void pause(Player player);
}
