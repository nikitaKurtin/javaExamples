package gof.structural.bridge;

public class LgTV implements TV {
    @Override
    public void on() {
        System.out.println("Turning on LG TV");
    }

    @Override
    public void off() {
        System.out.println("Turning off LG TV");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Changing channel on LG tv to: " + channel);
    }
}
