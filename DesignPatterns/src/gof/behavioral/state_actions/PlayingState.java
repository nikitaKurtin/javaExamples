package gof.behavioral.state_actions;

public class PlayingState implements State {
    @Override
    public void toggle(Player player) {
        player.pauseMusic();
    }

    @Override
    public void play(Player player) {
        System.out.println("Already Playing!!");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Now Pausing");
        player.setCurrentState(new PauseState());
    }
}
