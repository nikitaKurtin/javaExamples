package gang_of_four.structural.bridge;

public abstract class AbsRemote {
    private TV implementor;

    public AbsRemote(TV implementor) {
        this.implementor = implementor;
    }

    public void on() {
        implementor.on();
    }

    public void off() {
        implementor.off();
    }

    public void setChannel(int channel) {
        implementor.tuneChannel(channel);
    }
}
