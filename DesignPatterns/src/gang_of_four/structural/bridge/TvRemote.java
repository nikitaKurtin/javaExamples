package gang_of_four.structural.bridge;

public class TvRemote extends AbsRemote {
    int currentChannel;

    public TvRemote(TV implementor) {
        super(implementor);
        currentChannel = 0;
    }

    public void NextChannel() {
        currentChannel++;
        setChannel(currentChannel);
    }

    public void PrevChannel() {
        currentChannel--;
        setChannel(currentChannel);
    }
}
