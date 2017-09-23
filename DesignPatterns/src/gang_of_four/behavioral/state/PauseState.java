package gang_of_four.behavioral.state;

public class PauseState implements State {
    @Override
    public void toggle(Player player) {
        player.playMusic();
    }

    @Override
    public void play(Player player) {
        System.out.println("Now Playing");
        player.setCurrentState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Already in Pause");
    }
}
