package gof.behavioral.state;

public class Player {
    private State mCurrentState;

    public Player() {
        setCurrentState(new PauseState());
    }

    public State getCurrentState() {
        return mCurrentState;
    }

    public void setCurrentState(State currentState) {
        this.mCurrentState = currentState;
    }

    public void togglePlay() {
        System.out.println("Toggling state");
        mCurrentState.toggle(this);
    }

    public void playMusic() {
        mCurrentState.play(this);
    }

    public void pauseMusic() {
        mCurrentState.pause(this);
    }
}
